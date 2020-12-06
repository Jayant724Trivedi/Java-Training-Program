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
<%@ page import="java.sql.*" %>
<%@include file="connect.jsp" %>
<table border="2" align="center" width="600" height="300" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Email</td><td>Salary</td><td>Company Name</td><td>Age</td><td>Phone</td><td>Address</td><td>Action</td></tr>
<%
int id=(Integer)session.getAttribute("id");
ps=con.prepareStatement("select * from employee where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt("id") %></td>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getInt("salary") %></td>
<td><%=rs.getString("company_name") %></td>
<td><%=rs.getInt("age") %></td>
<td><%=rs.getInt("phone") %></td>
<td><%=rs.getString("address") %></td>
<td><a href="update_employee_profile.jsp?id=<%=rs.getInt(1)%>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>