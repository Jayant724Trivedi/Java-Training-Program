<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO PATIENT HOME</h1></center>
<br><br><br>
<a href="patient_home.html">Home</a>
<a href="patient_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="com.motivitylabs.PatientRegisterBean" %>
<table border="2" align="center" width="500" height="300" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Email</td><td>Phone</td><td>Address</td><td>Action</td></tr>
<%
	PatientRegisterBean prb=(PatientRegisterBean)session.getAttribute("patientDetails");
if(prb!=null){
%>
<tr>
	<td><%=prb.getId()%></td>
	<td><%=prb.getName()%></td>
	<td><%=prb.getEmail()%></td>
	<td><%=prb.getPhone()%></td>
	<td><%=prb.getAddress()%></td>
	<td><a href="update_patient_profile.jsp?id=<%=prb.getId()%>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>