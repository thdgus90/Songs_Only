package controller;

import util.AuthInfo;
import util.LoginCommand;

public interface UserService {
    AuthInfo loginAuth(LoginCommand loginCommand) throws Exception;
 

}
