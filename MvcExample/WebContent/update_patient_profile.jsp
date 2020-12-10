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
<%
	PatientRegisterBean prb=(PatientRegisterBean)session.getAttribute("patientDetails");
if(prb!=null){
%>
<form action="./patient_profile_update.jsp" method="post" align="center">
<input type="hidden" name="id" value="<%=prb.getId()%>">
<input type="text" name="name" value="<%=prb.getName()%>">
<input type="email" name="email" value="<%=prb.getEmail()%>">
<input type="number" name="phone" value="<%=prb.getPhone()%>">
<input type="text" name="address" value="<%=prb.getAddress()%>">
<input type="submit" value="Update">
</form>
<%}%>
</body>
</html>
