package com.telegram.service;

import com.telegram.dao.TelegramDAO;
import com.telegram.dao.TelegramDAOInterface;
import com.telegram.entity.TelegramUser;

public class TelegramService implements TelegramServiceInterface {

	@Override
	public int createProfile(TelegramUser tu) {
		TelegramDAOInterface td=new TelegramDAO();
		int i=td.createProfileDAO();
		
		return 0;
	}

}
