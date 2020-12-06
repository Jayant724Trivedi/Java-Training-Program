<%@include file="connect.jsp"%>
<%
String employee_name = request.getParameter("employee_name");
long phone = Long.parseLong(request.getParameter("phone"));
String email = request.getParameter("email");
String gender = request.getParameter("gender");
int no_of_days=Integer.parseInt(request.getParameter("no_of_days"));
String date_of_leave = request.getParameter("date_of_leave");
String designation=request.getParameter("designation");
int id=(Integer)session.getAttribute("id");
String sql = "insert into leaves(employee_name,phone,email,gender,no_of_days,date_of_leave,designation,eid) values(?,?,?,?,?,?,?,?)";
ps = con.prepareStatement(sql);
ps.setString(1, employee_name);
ps.setLong(2, phone);
ps.setString(3, email);
ps.setString(4, gender);
ps.setInt(5, no_of_days);
ps.setString(6, date_of_leave);
ps.setString(7, designation);
ps.setInt(8,id);
int x = ps.executeUpdate();
if (x!= 0)
	response.sendRedirect("leave.jsp?msg=applied_leave");
%>
