<%@ page import="java.sql.*" %>
<%@include file="connect.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String email=request.getParameter("email");
int salary=Integer.parseInt(request.getParameter("salary"));
String company_name=request.getParameter("company_name");
long phone=Long.parseLong(request.getParameter("phone"));
String address=request.getParameter("address");

ps=con.prepareStatement("update manager set name=?,email=?,salary=?,company_name=?,phone=?,address=? where id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setInt(3,salary);
ps.setString(4,company_name);
ps.setLong(5,phone);
ps.setString(6,address);
ps.setInt(7,id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("manager_profile.jsp?msg=Updated");

%>