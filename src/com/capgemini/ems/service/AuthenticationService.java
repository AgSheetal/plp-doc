package com.capgemini.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.ems.bean.UserBean;
import com.capgemini.ems.dao.IAuthenticationDao;

@Service
public class AuthenticationService implements IAuthenticationService {
	@Autowired
	private IAuthenticationDao authenticationDao;
	
	@Override
	public UserBean getUser(String userName, String userPassword) {
		
		return authenticationDao.getUser(userName, userPassword);
	}

}
