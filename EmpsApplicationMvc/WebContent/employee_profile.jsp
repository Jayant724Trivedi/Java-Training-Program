<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO EMPLOYEE PROFILE PAGE</h1></center>
<br><br><br>
<a href="employee_home.html">Home</a>
<a href="employee_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="com.office.EmployeeRegisterBean" %>
<table border="2" align="center" width="600" height="300" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Email</td><td>Salary</td><td>Company Name</td><td>Age</td><td>Phone</td><td>Address</td><td>Action</td></tr>
<%
	EmployeeRegisterBean erb=(EmployeeRegisterBean)session.getAttribute("employeeDetails");
if(erb!=null){
%>
<tr>
<td><%=erb.getId()%></td>
<td><%=erb.getName() %></td>
<td><%=erb.getEmail()%></td>
<td><%=erb.getSalary()%></td>
<td><%=erb.getCompany_name() %></td>
<td><%=erb.getAge() %></td>
<td><%=erb.getPhone() %></td>
<td><%=erb.getAddress() %></td>
<td><a href="update_employee_profile.jsp?id=<%=erb.getId()%>">Update</a></td>
</tr>
<%}%>
</table>
</body>
</html>