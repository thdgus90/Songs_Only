package controller;

import javax.annotation.Resource;

import dao.UserDAO;
import dao.UserVO;
import exception.IdPasswordNotMatchingException;
import util.AuthInfo;
import util.LoginCommand;

public class UserServiceImpl {
	
    @Resource(name="userDAO")
    private UserDAO userDAO;
 
    public AuthInfo loginAuth(LoginCommand loginCommand) throws Exception {
        UserVO user = userDAO.selectById(loginCommand.getId());
        if(user == null) {
            throw new IdPasswordNotMatchingException();
        }
        if(!user.matchPassword(loginCommand.getPw())) {
            throw new IdPasswordNotMatchingException();
        }
        return new AuthInfo(user.getID(), user.getNAME(), user.getGRADE());
    }

}
