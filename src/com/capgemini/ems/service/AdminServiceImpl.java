package com.capgemini.ems.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.ems.bean.EmployeeBean;
import com.capgemini.ems.dao.IAdminDao;
import com.capgemini.ems.exception.EMSException;

@Transactional
@Service
public class AdminServiceImpl implements IAdminService {
	
	@Autowired
	private IAdminDao adminDao;

	@Override
	public boolean addEmployee(EmployeeBean employee) {
		// TODO Auto-generated method stub
		return adminDao.addEmployee(employee);
	}

	@Override
	public List<String> getDepartmentList() {
		// TODO Auto-generated method stub
		return adminDao.getDepartmentList();
	}

	@Override
	public List<String> getGradeList() {
		// TODO Auto-generated method stub
		return adminDao.getGradeList();
	}

	@Override
	public List<String> getMaritalStatusList() {
		// TODO Auto-generated method stub
		return adminDao.getMaritalStatusList();
	}

	@Override
	public List<EmployeeBean> getEmployeeDetails() {
		// TODO Auto-generated method stub
		return adminDao.getEmployeeDetails();
	}

	@Override
	public EmployeeBean findItem(String employeeId) {
		// TODO Auto-generated method stub
		return adminDao.findItem(employeeId);
	}

	@Override
	public boolean modifyEmployee(EmployeeBean employee) throws EMSException {
		// TODO Auto-generated method stub
		return adminDao.modifyEmployee(employee);
	}

}
