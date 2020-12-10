<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO DOCTOR UPDATE PAGE</h1></center>
<br><br><br>
<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="com.motivitylabs.DoctorRegisterBean" %>
<%
	DoctorRegisterBean rb=(DoctorRegisterBean)session.getAttribute("doctorDetails");
if(rb!=null){
%>
<form action="./doctor_profile_update.jsp" method="post" align="center">
<input type="hidden" name="id" value="<%=rb.getId()%>">
<input type="text" name="name" value="<%=rb.getName()%>">
<input type="email" name="email" value="<%=rb.getEmail()%>">
<input type="number" name="phone" value="<%=rb.getPhone()%>">
<select name="specialisation">
<option value="<%=rb.getSpecialisation()%>"><%=rb.getSpecialisation()%></option>
<option value="DENTIST">DENTIST</option>
<option value="ENT">ENT</option>
<option value="CARDIAOLIGST">CARDIAOLIGST</option>
</select>
<input type="submit" value="Update">
</form>
<%}%>
</body>
</html>
