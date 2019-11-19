package controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dao.SignVO;

@Controller
@RequestMapping("/signup") 
public class SignupController {

	@Autowired
	private SignupServiceImpl signupServiceImpl;
	
	
	  //SignUp GET
	 
	  @RequestMapping(value="/signup.do", method=RequestMethod.GET) public void
	  signupGET() { System.out.println("@@@"); }
	 

	// SignUp PSOT
	@RequestMapping(value = "/signup.do", method = RequestMethod.POST)
	public String signupPOST(SignVO signVO, @RequestParam String m_birthYear, @RequestParam String m_birthMonth,
			@RequestParam String m_birthDay) {

		System.out.println("###");

		signVO.setM_birth(m_birthYear + m_birthMonth + m_birthDay);

		signupServiceImpl.insertMember(signVO);

		return "redirect:../PlzWindowShop/main.jsp";

	}

}
