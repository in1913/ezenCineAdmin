package com.ezencinema.database;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


public class MemberDao implements MemberConfig{
	
	private static MemberDao dao;
	private MemberDao() {};
	public static MemberDao getInterface() {
		if(dao == null) dao = new MemberDao();
		return dao;
	}
	
	// SQL 세션 열기
	SqlSessionFactory sft = SqlMapSessionFactory.getSqlSessionFactory();
	
	@Override
	public List <MemberDto> selectMem(){
		SqlSession session = sft.openSession();
		List <MemberDto> dto = session.selectList("com.ezencinema.database.memberMapper.selectMem");
		session.close();
		return dto;
	}
	

}
