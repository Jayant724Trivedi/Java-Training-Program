<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO DETAILS PAGE</h1></center>
<br><br><br>
<a href="manager_home.html">Home</a>
<a href="manager_profile.jsp">Profile</a>
<a href="view_leave.jsp">Leave Details</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@page import="com.office.ViewLeaveBean,java.util.*" %>
<table border="2" width="600" height="300" cellpadding="20">
<tr><td>Employee Name</td><td>Phone</td><td>Email</td><td>Gender</td><td>No of days</td><td>Date of leave</td><td>Designation</td>
<td>Status</<td><td>Manager Name</td><td>Action</td></tr>
<%
String designation=(String)session.getAttribute("designation");
List<ViewLeaveBean> l=new ViewLeaveBean().view(designation);
Iterator i=l.iterator();
while(i.hasNext()){
		ViewLeaveBean vlb=(ViewLeaveBean)i.next();
		int eid=vlb.getEid();
		int no_of_leaves_taken=new ViewLeaveBean().details(eid);
%>
<tr>
<td><%=vlb.getEmployee_name()%></td>
<td><%=vlb.getPhone()%></td>
<td><%=vlb.getEmail()%></td>
<td><%=vlb.getGender()%></td>
<td><%=vlb.getNo_of_days()%></td>
<td><%=vlb.getDate_of_leave()%></td>
<td><%=vlb.getDesignation()%></td>
<td><%=vlb.getStatus()%></td>
<td><%=vlb.getManager_name()%></td>
<%if(vlb.getNo_of_days()<20-no_of_leaves_taken){
	if(vlb.getStatus().equalsIgnoreCase("Accepted")){%>
<td>Accepted</td>
<%} else {%>
<td><a href="accept_leave.jsp?id=<%=vlb.getLid()%>&eid=<%=eid%>&no_of_days=<%=vlb.getNo_of_days()%>">Accept</a></td>
<%}
	}else {%>
			<td><a href="reject_leave.jsp?id=<%=vlb.getLid()%>">Reject</a></td>
			<%} %>
</tr>
<%} %>
</table>
</body>
</html>