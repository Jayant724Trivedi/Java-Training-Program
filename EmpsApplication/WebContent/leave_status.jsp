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
<%@include file="connect.jsp" %>
<table border="2" width="600" height="300" cellpadding="20">
<tr><td>Employee Name</td><td>Phone</td><td>Email</td><td>Gender</td><td>No of days</td><td>Date of leave</td>
<td>Designation</td><td>Status</<td><td>Manager Name</td><td>No of leave remaining</td></tr>
<%
int id=(Integer)session.getAttribute("id");
int no_of_leaves_taken=(Integer)session.getAttribute("leaves");
ps=con.prepareStatement("select * from leaves where eid=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString(2)%></td>
<td><%=rs.getInt(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5)%></td>
<td><%=rs.getString(6)%></td>
<td><%=rs.getString(7)%></td>
<td><%=rs.getString(8)%></td>
<td><%=rs.getString(9)%></td>
<td><%=rs.getString(10)%></td>
<td><%=20-no_of_leaves_taken %>
</tr>
<%} %>
</table>
</body>
</html>