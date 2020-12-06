<%@ page import="java.sql.*" %>
<%@include file="connect.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String email=request.getParameter("email");
int salary=Integer.parseInt(request.getParameter("salary"));
String company_name=request.getParameter("company_name");
int age=Integer.parseInt(request.getParameter("age"));
long phone=Long.parseLong(request.getParameter("phone"));
String address=request.getParameter("address");

ps=con.prepareStatement("update employee set name=?,email=?,salary=?,company_name=?,age=?,phone=?,address=? where id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setInt(3,salary);
ps.setString(4,company_name);
ps.setInt(5,age);
ps.setLong(6,phone);
ps.setString(7,address);
ps.setInt(8,id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("employee_profile.jsp?msg=Updated");
%>