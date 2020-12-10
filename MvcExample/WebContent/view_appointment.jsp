<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO APPOINTMENT DETAILS PAGE</h1></center>
<br><br><br>
<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp">Profile</a>
<a href="view_appointment.jsp">Appointment Details</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@page import="com.motivitylabs.ViewAppointmentBean,java.util.*" %>
<table border="2" width="600" height="300" cellpadding="20">
<tr><td>Patient Name</td><td>Phone</td><td>Email</td><td>Gender</td><td>Blood Group</td><td>Specialist</td>
<td>Date</td><td>Time</td><td>Status</<td><td>Doctor Name</td><td>Action</td></tr>
<%
String specialist=(String)session.getAttribute("specialist");
List<ViewAppointmentBean> l=new ViewAppointmentBean().view(specialist);
Iterator i=l.iterator();
while(i.hasNext()){
	ViewAppointmentBean vab=(ViewAppointmentBean)i.next();
%>
<tr>
		<td><%=vab.getPatient_name() %></td>
		<td><%=vab.getPhone() %></td>
		<td><%=vab.getEmail() %></td>
		<td><%=vab.getGender() %></td>
		<td><%=vab.getBlood_group() %></td>
		<td><%=vab.getSpecialist() %></td>
		<td><%=vab.getDate_of_appointment() %></td>
		<td><%=vab.getTime_of_appointment() %></td>
		<td><%=vab.getDoctor_name() %></td>
		<td><%=vab.getStatus() %></td>
<%if(vab.getStatus().equalsIgnoreCase("Accepted")){%>
<td>Accepted</td>
<%} else {%>
<td><form action="./accept_appointment.jsp" method="post"><input type="hidden" name="id" value="<%=vab.getAid()%>">
<input type="submit" value="Accept">
</form></td>
<%} %>
</tr>
<%} %>
</table>
</body>
</html>