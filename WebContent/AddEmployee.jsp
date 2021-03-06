<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Add Employee Form</h3>


<form:form action="submitEmployee.obj" modelAttribute="addEmployee">
<table>
<tr>
			<td>Employee Id</td>
			<td><form:input path="employeeId"/>
			<form:errors path = "employeeId"/>
			</td>
			
		</tr>
		<tr>
			<td>first Name</td>
			<td><form:input path="employeeFirstName"/>
			<form:errors path = "employeeFirstName"/>
			</td>
			
		</tr>
		<tr>
			<td>Last Name</td>
			<td><form:input path="employeeLastName"/>
			<form:errors path = "employeeLastName"/>
			</td>
		</tr>
		<tr>
			<td>Employee DOB</td>
			<td><form:input type = "date" path="employeeDOB"/>
			<form:errors path = "employeeDOB"/>
			</td>
		</tr>
		<tr>
			<td>Employee DOJ</td>
			<td><form:input type = "date" path="employeeDOJ"/>
			<form:errors path = "employeeDOJ"/>
			</td>
		</tr>
		
		<tr>
			<td>Employee Department Name</td>
			<td><form:select path="employeeDeptName">
			<form:option value="select"></form:option>
			<form:options items = "${departmentList}"/>
			</form:select>
			<form:errors path = "employeeDeptName"/>
			</td>
		</tr>
		<tr>
			<td>Employee Grade</td>
			<td>
			<form:select path="employeeGrade">
			<form:option value="select"></form:option>
			<form:options items = "${gradeList}"/>
			</form:select>
			<form:errors path = "employeeGrade"/></td>
		</tr>
		<tr>
			<td>Employee Designation</td>
			<td><form:input path="employeeDesignation"/>
			<form:errors path = "employeeDesignation"/></td>
		</tr>
		<tr>
			<td>Employee Basic Salary</td>
			<td><form:input type = "number" path="employeeBasic"/>
			<form:errors path = "employeeBasic"/></td>
		</tr>
		
		<tr>
			<td>Employee Gender</td>
			<td><form:radiobutton path="employeeGender" value = "M"/>Male
			<form:radiobutton path="employeeGender" value = "F"/>Female</td>
		</tr>
		<tr>
			<td>Employee Marital Status</td>
			<td><form:select path="employeeMarital">
			<form:option value="select"></form:option>
			<form:options items = "${maritalStatusList}"/>
			</form:select>
			<form:errors path = "employeeMarital"/></td>
		</tr>
		<tr>
			<td>Employee Address</td>
			<td><form:input path="employeeAddress"/>
			<form:errors path = "employeeAddress"/></td>
		</tr>
		<tr>
			<td>Employee Contact No.</td>
			<td><form:input path="employeeContact"/>
			<form:errors path = "employeeContact"/></td>
		</tr>
		<tr>
			<td>Employee Manager Id</td>
			<td><form:input path="employeeManagerId"/>
			<form:errors path = "employeeManagerId"/></td>
		</tr>
		
		<tr>
			<td>Employee Leave Balance</td>
			<td><form:input path="employeeLeaveBal"/>
			<form:errors path = "employeeLeaveBal"/></td>
		</tr>
		
		<tr>
		<tr>
		
			<td colspan="2"><input type="submit" value="Add Employee"></td>
		</tr>
	</table>
</form:form>

</body>
</html>