package com.capgemini.ems.dao;

import com.capgemini.ems.bean.UserBean;

public interface IAuthenticationDao {

	UserBean getUser(String userName, String userPassword);

}
