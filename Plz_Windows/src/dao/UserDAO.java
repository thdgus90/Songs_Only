package dao;

import org.springframework.stereotype.Repository;

@Repository("userDAO")
	public class UserDAO extends AbstactDAO{
	 
	    public UserVO selectById(String id) {
	        return (UserVO) selectOne("user.selectById", id);
	    }
	 
	}
