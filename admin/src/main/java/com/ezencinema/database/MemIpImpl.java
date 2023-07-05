package com.ezencinema.database;

import java.util.List;

public class MemIpImpl implements UserIpConfig{
	
	UserIpDao dao = UserIpDao.getInterface();

	@Override
	public List<UserIpDto> selectMemIp() {
		return dao.selectMemIp();
	}
}
