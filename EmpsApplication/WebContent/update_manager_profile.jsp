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
<%@ page import="java.sql.*" %>
<%@include file="connect.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("select * from manager where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
if(rs.next()){
%>
<form action="./manager_profile_update.jsp" method="post" align="center">
<input type="hidden" name="id" value="<%=rs.getInt("id")%>">
<input type="text" name="name" value="<%=rs.getString("name")%>">
<input type="email" name="email" value="<%=rs.getString("email")%>">
<input type="number" name="salary" value="<%=rs.getInt("salary")%>">
<input type="text" name="company_name" value="<%=rs.getString("company_name")%>">
<input type="number" name="phone" value="<%=rs.getInt("phone")%>">
<input type="text" name="address" value="<%=rs.getString("address")%>">
<input type="submit" value="Update">
</form>
<%}%>