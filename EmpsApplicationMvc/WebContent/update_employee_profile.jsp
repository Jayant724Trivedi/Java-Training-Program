<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO EMPLOYEE PROFILE UPDATE PAGE</h1></center>
<br><br><br>
<a href="employee_home.html">Home</a>
<a href="employee_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="com.office.EmployeeRegisterBean" %>
<%
	EmployeeRegisterBean erb=(EmployeeRegisterBean)session.getAttribute("employeeDetails");
if(erb!=null){
%>
<form action="./employee_profile_update.jsp" method="post" align="center">
<input type="hidden" name="id" value="<%=erb.getId()%>">
<input type="text" name="name" value="<%=erb.getName()%>">
<input type="email" name="email" value="<%=erb.getEmail()%>">
<input type="number" name="salary" value="<%=erb.getSalary()%>">
<input type="text" name="company_name" value="<%=erb.getCompany_name()%>">
<input type="number" name="age" value="<%=erb.getAge()%>">
<input type="number" name="phone" value="<%=erb.getPhone()%>">
<input type="text" name="address" value="<%=erb.getAddress()%>">
<input type="submit" value="Update">
</form>
<%}%>
</body>
</html>
