package com.capgemini.ems.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name = "employee_table")
public class EmployeeBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "emp_id")
	private String employeeId;
	
	@Column(name = "emp_first_name")
	private String employeeFirstName;
	
	@Column(name = "emp_last_name")
	private String employeeLastName;
	
	@Column(name = "emp_date_of_birth")
	private Date employeeDOB;
	
	@Column(name = "emp_date_of_joining")
	private Date employeeDOJ;
	
	@Column(name = "emp_date_name")
	private String employeeDeptName;
	
	@Column(name = "emp_grade")
	private String employeeGrade;
	
	@Column(name = "emp_designation")
	private String employeeDesignation;
	
	@Column(name = "emp_basic")
	private int employeeBasic;
	
	@Column(name = "emp_gender")
	private char employeeGender;
	
	@Column(name = "emp_marital_status")
	private String employeeMarital;
	
	@Column(name = "emp_home_address")
	private String employeeAddress;
	
	@Column(name = "emp_contact_num")
	private String employeeContact;
	
	@Column(name = "mgr_id")
	private String employeeManagerId;
	
	@Column(name = "emp_leave_bal")
	private int employeeLeaveBal;
	
	public EmployeeBean() {	
	}

	public EmployeeBean(String employeeId, String employeeFirstName,
			String employeeLastName, Date employeeDOB, Date employeeDOJ,
			String employeeDeptId, String employeeGrade,
			String employeeDesignation, int employeeBasic, char employeeGender,
			String employeeMarital, String employeeAddress,
			String employeeContact, String employeeMgrId, int employeeLeaveBal) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeDOB = employeeDOB;
		this.employeeDOJ = employeeDOJ;
		this.employeeDeptName = employeeDeptId;
		this.employeeGrade = employeeGrade;
		this.employeeDesignation = employeeDesignation;
		this.employeeBasic = employeeBasic;
		this.employeeGender = employeeGender;
		this.employeeMarital = employeeMarital;
		this.employeeAddress = employeeAddress;
		this.employeeContact = employeeContact;
		this.employeeManagerId = employeeMgrId;
		this.employeeLeaveBal = employeeLeaveBal;
	}

	@NotEmpty(message = "Employee Id is required")
	@Pattern(regexp = "^[1-9]{1}[0-9]{5}$",message = "Employee Id should be 6 digits long and should not start with 0")
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@NotEmpty(message = "Employee First Name is required")
	@Pattern(regexp="^[A-Z]{1}[A-Za-z]+$",message = "Employee first name should start with capital letters")
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	@NotEmpty(message = "Employee Last Name is required")
	@Pattern(regexp="^[A-Z]{1}[A-Za-z]+$",message = "Employee Last name should start with capital letters")
	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	@javax.validation.constraints.NotNull(message="Date of birth is required")
	public Date getEmployeeDOB() {
		return employeeDOB;
	}

	
	public void setEmployeeDOB(Date employeeDOB) {
		this.employeeDOB = employeeDOB;
	}

	@javax.validation.constraints.NotNull(message="Date of joining is required")
	public Date getEmployeeDOJ() {
		return employeeDOJ;
	}

	public void setEmployeeDOJ(Date employeeDOJ) {
		this.employeeDOJ = employeeDOJ;
	}
	
	@NotEmpty(message = "Employee Grade is required")
	public String getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	
	@Size(max=50)
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	@NotNull(message = "Employee Basic is required")
	public int getEmployeeBasic() {
		return employeeBasic;
	}

	public void setEmployeeBasic(int employeeBasic) {
		this.employeeBasic = employeeBasic;
	}

	@NotEmpty(message = "Employee Department Name is required")
	public String getEmployeeDeptName() {
		return employeeDeptName;
	}

	public void setEmployeeDeptName(String employeeDeptName) {
		this.employeeDeptName = employeeDeptName;
	}

	@NotEmpty(message = "Employee Manager Id is required")
	@Pattern(regexp = "^[1-9]{1}[0-9]{5}$",message = "Employee Manager Id should be 6 digits long and should not start with 0")
	public String getEmployeeManagerId() {
		return employeeManagerId;
	}

	public void setEmployeeManagerId(String employeeManagerId) {
		this.employeeManagerId = employeeManagerId;
	}

	@NotNull(message = "Employee Gender is required")
	public char getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(char employeeGender) {
		this.employeeGender = employeeGender;
	}

	@NotEmpty(message = "Employee Marital Status is required")
	public String getEmployeeMarital() {
		return employeeMarital;
	}

	public void setEmployeeMarital(String employeeMarital) {
		this.employeeMarital = employeeMarital;
	}

	@Pattern(regexp = "^[A-Za-z0-9 ]+$")
	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	@Pattern(regexp="^[0-9]+$")
	public String getEmployeeContact() {
		return employeeContact;
	}

	public void setEmployeeContact(String employeeContact) {
		this.employeeContact = employeeContact;
	}

	@NotNull(message = "Employee Leave Balance is required")
	public int getEmployeeLeaveBal() {
		return employeeLeaveBal;
	}

	public void setEmployeeLeaveBal(int employeeLeaveBal) {
		this.employeeLeaveBal = employeeLeaveBal;
	}

	@Override
	public String toString() {
		return "EmployeeBean [employeeId=" + employeeId
				+ ", employeeFirstName=" + employeeFirstName
				+ ", employeeLastName=" + employeeLastName + ", employeeDOB="
				+ employeeDOB + ", employeeDOJ=" + employeeDOJ
				+ ", employeeDeptId=" + employeeDeptName + ", employeeGrade="
				+ employeeGrade + ", employeeDesignation="
				+ employeeDesignation + ", employeeBasic=" + employeeBasic
				+ ", employeeGender=" + employeeGender + ", employeeMarital="
				+ employeeMarital + ", employeeAddress=" + employeeAddress
				+ ", employeeContact=" + employeeContact + ", employeeMgrId="
				+ employeeManagerId + ", employeeLeaveBal=" + employeeLeaveBal
				+ "]";
	}
	
	
	
}
