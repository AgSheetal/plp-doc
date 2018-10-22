package com.capgemini.ems.dao;

import org.springframework.stereotype.Repository;

import com.capgemini.ems.bean.UserBean;

@Repository
public class AuthenticationDaoImpl implements IAuthenticationDao {

	@Override
	public UserBean getUser(String userName, String userPassword) {
		boolean success = false;
		UserBean user1 = new UserBean("101", "sys", "admin", "ADMIN");
		UserBean user2 = new UserBean("102", "user", "123", "EMPLOYEE");
		return user1;
	}

}
