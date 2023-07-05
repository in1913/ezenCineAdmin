package com.ezencinema.database;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserIpDao implements UserIpConfig{
	private static UserIpDao dao;
	private UserIpDao() {};
	public static UserIpDao getInterface() {
		if(dao == null) dao = new UserIpDao();
		return dao;
	}
	
	// SQL 세션 열기
	SqlSessionFactory sft = SqlMapSessionFactory.getSqlSessionFactory();
	
	@Override 
	public List <UserIpDto> selectMemIp(){
		SqlSession session = sft.openSession();
		List <UserIpDto> dto = session.selectList("com.ezencinema.database.user_ipMapper.selectMemIp");
		session.close();
		return dto;
	}
}
