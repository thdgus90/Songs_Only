package dao;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SignupDAOImpl extends SqlSessionDaoSupport implements SignupDAO {
	
	@Override
	public void insertMember(SignVO signVO) {
		// TODO Auto-generated method stub
		SqlSession session = getSqlSession();
		session.insert("join.insertMember",signVO);
	}

}
