<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO APPOINTMENT STATUS PAGE</h1></center>
<br><br><br>
<a href="patient_home.html">Home</a>
<a href="patient_profile.jsp">Profile</a>
<a href="./appointment.jsp">Appointment</a> 
<a href="appointment_status.jsp">Appointment status</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@page import="com.motivitylabs.AppointmentBean,java.util.*" %>
<table border="2" width="600" height="300" cellpadding="20">
<tr><td>Patient Name</td><td>Phone</td><td>Email</td><td>Gender</td><td>Blood Group</td><td>Specialist</td>
<td>Date</td><td>Time</td><td>Status</<td><td>Doctor Name</td></tr>
<%
int id=(Integer)session.getAttribute("id");
List<AppointmentBean> l=new AppointmentBean().status(id);
Iterator i=l.iterator();
while(i.hasNext()){
	AppointmentBean ab=(AppointmentBean)i.next();
%>
<tr>
		<td><%=ab.getPatient_name()%></td>
		<td><%=ab.getPhone()%></td>
		<td><%=ab.getEmail()%></td>
		<td><%=ab.getGender()%></td>
		<td><%=ab.getBlood_group()%></td>
		<td><%=ab.getSpecialist()%></td>
		<td><%=ab.getDate_of_appointment()%></td>
		<td><%=ab.getTime_of_appointment()%></td>
		<td><%=ab.getStatus()%></td>
		<td><%=ab.getDoctor_name()%></td>
</tr>
<%} %>
</table>
</body>
</html>