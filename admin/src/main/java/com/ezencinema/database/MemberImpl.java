package com.ezencinema.database;

import java.util.List;

public class MemberImpl implements MemberConfig{
	
	MemberDao dao = MemberDao.getInterface();

	@Override
	public List<MemberDto> selectMem() {
		return dao.selectMem();
	}
}
