package controller;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import dao.SignupDAO;
import dao.SignVO;

@Service
public class SignupServiceImpl implements SignupService {

	@Inject
    private SignupDAO dao;
	
	@Override
	public void insertMember(SignVO signVO) {
		// TODO Auto-generated method stub
		System.out.println(dao.getClass());
		System.out.println(signVO);
		
		dao.insertMember(signVO);
	}

}
