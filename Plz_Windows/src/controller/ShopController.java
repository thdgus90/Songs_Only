package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.ItemDao;


@Controller
public class ShopController {

	@Autowired
	private ItemDao shopService;
	

	@RequestMapping("/shop.do")
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		//게임 리스트 정보 취득
		List itemList = this.shopService.list();
		
		//모델작성
		Map model = new HashMap();
		model.put("itemList",  itemList);
		
		//반환값이 되는 ModelAndView인스턴스 작성
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/PlzWindowShop/fgame.jsp");
		modelAndView.addAllObjects(model);
		
		
		return modelAndView;
	}
}
