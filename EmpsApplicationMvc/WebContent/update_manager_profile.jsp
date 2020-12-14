<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO MANAGER HOME</h1></center>
<br><br><br>
<a href="manager_home.html">Home</a>
<a href="manager_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="com.office.ManagerRegisterBean" %>
<%
	ManagerRegisterBean mrb=(ManagerRegisterBean)session.getAttribute("managerDetails");
if(mrb!=null){
%>
<form action="./manager_profile_update.jsp" method="post" align="center">
<input type="hidden" name="id" value="<%=mrb.getId()%>">
<input type="text" name="name" value="<%=mrb.getName()%>">
<input type="email" name="email" value="<%=mrb.getEmail()%>">
<input type="number" name="salary" value="<%=mrb.getSalary()%>">
<input type="text" name="company_name" value="<%=mrb.getCompany_name()%>">
<input type="number" name="phone" value="<%=mrb.getPhone()%>">
<input type="text" name="address" value="<%=mrb.getAddress()%>">
<input type="submit" value="Update">
</form>
<%}%>