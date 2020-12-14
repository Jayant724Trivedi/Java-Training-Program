<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO MANAGER PROFILE PAGE</h1></center>
<br><br><br>
<a href="manager_home.html">Home</a>
<a href="manager_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="com.office.ManagerRegisterBean" %>
<table border="2" align="center" width="600" height="300" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Email</td><td>Salary</td><td>Company Name</td><td>Phone</td><td>Address</td><td>Action</td></tr>
<%
	ManagerRegisterBean mrb=(ManagerRegisterBean)session.getAttribute("managerDetails");
if(mrb!=null){
%>
<tr>
<td><%=mrb.getId() %></td>
<td><%=mrb.getName()%></td>
<td><%=mrb.getEmail() %></td>
<td><%=mrb.getSalary()%></td>
<td><%=mrb.getCompany_name() %></td>
<td><%=mrb.getPhone() %></td>
<td><%=mrb.getAddress() %></td>
<td><a href="update_manager_profile.jsp?id=<%=mrb.getId()%>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>
