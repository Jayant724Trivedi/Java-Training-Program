<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO LEAVE STATUS PAGE</h1></center>
<br><br><br>
<a href="employee_home.html">Home</a>
<a href="employee_profile.jsp">Profile</a>
<a href="leave.jsp">Leave Application</a> 
<a href="leave_status.jsp">Leave status</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@page import="com.office.LeaveApplyBean,java.util.*" %>
<table border="2" width="600" height="300" cellpadding="20">
<tr><td>Employee Name</td><td>Phone</td><td>Email</td><td>Gender</td><td>No of days</td><td>Date of leave</td>
<td>Designation</td><td>Status</<td><td>Manager Name</td><td>No of leave remaining</td></tr>
<%
int id=(Integer)session.getAttribute("id");
int no_of_leaves_taken=(Integer)session.getAttribute("leaves");
List<LeaveApplyBean> l=new LeaveApplyBean().status(id);
Iterator i=l.iterator();
while(i.hasNext()){
		LeaveApplyBean lab=(LeaveApplyBean)i.next();
%>
<tr>
<td><%=lab.getEmployee_name()%></td>
<td><%=lab.getPhone()%></td>
<td><%=lab.getEmail()%></td>
<td><%=lab.getGender()%></td>
<td><%=lab.getNo_of_days()%></td>
<td><%=lab.getDate_of_leave()%></td>
<td><%=lab.getDesignation()%></td>
<td><%=lab.getStatus()%></td>
<td><%=lab.getManager_name()%></td>
<td><%=20-no_of_leaves_taken %>
</tr>
<%} %>
</table>
</body>
</html>