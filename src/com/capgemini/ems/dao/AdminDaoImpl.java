package com.capgemini.ems.dao;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;




import com.capgemini.ems.bean.EmployeeBean;
import com.capgemini.ems.exception.EMSException;



@Transactional
@Repository
public class AdminDaoImpl implements IAdminDao {

	@PersistenceContext
	private EntityManager eManager;
	@Override
	public boolean addEmployee(EmployeeBean employee){

		System.out.println("dao submit");
		boolean success = false;
		
			eManager.persist(employee);
			success=true;

		return success;
	}
	@Override
	public List<String> getDepartmentList() {
		String qStr = "SELECT dept.deptName FROM DepartmentBean dept";
		TypedQuery<String> query = eManager.createQuery(qStr, String.class);
		List<String> deptList = query.getResultList();
		System.out.println(deptList);
		return deptList;
	}
	@Override
	public List<String> getGradeList() {
		String qStr = "SELECT grade.gradeCode FROM EmployeeGradeBean grade";
		TypedQuery<String> query = eManager.createQuery(qStr, String.class);
		List<String> gradeList = query.getResultList();
		System.out.println(gradeList);
		return gradeList;
	}
	@Override
	public List<String> getMaritalStatusList() {
		
		List<String> statusList = new ArrayList<String>();
		statusList.add("Single");
		statusList.add("Married");
		statusList.add("Divorced");
		statusList.add("Separated");
		statusList.add("Widowed");
		return statusList;
	}
	@Override
	public List<EmployeeBean> getEmployeeDetails() {
		String sql="SELECT employee from EmployeeBean employee";
		TypedQuery<EmployeeBean> qry=eManager.createQuery(sql, EmployeeBean.class);
		@SuppressWarnings("unchecked")
		List<EmployeeBean> employeeList=qry.getResultList();
	
		
		
		return employeeList;
	}
	@Override
	public EmployeeBean findItem(String employeeId) {
		// TODO Auto-generated method stub
				EmployeeBean employee = eManager.find(EmployeeBean.class,employeeId);
				return employee;
	}
	@Override
	public boolean modifyEmployee(EmployeeBean employee) throws EMSException {
		boolean success = false;
		try{
		eManager.merge(employee);
		success = true;
		}
		catch(Exception e){
			throw new EMSException(e.getMessage());
		}
		return success;
	}
	
}
