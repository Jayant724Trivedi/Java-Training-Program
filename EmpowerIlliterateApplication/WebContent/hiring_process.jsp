<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO HIRING PAGE</h1></center>
<br><br><br>
<a href="home.html">Home</a>
<a href="index.html">Logout</a>
<br><br><br>
<input type="radio" name="skill" value="carpentry">carpentry
<input type="radio" name="skill" value="farming">farming
<input type="radio" name="skill" value="driving">driving
<input type="submit" value="Apply">
<br><br><br>
<%@include file="connect.jsp" %>
<table border="2" width="600" height="300" cellpadding="20">
<tr><td>Hiree Name</td><td>Phone</td><td>Skill</td><td>Experience</td><td>Age</td>
<td>City</td></tr>
<%
String skill=(String)session.getAttribute("skill");
ps=con.prepareStatement("select * from hiree where skill=?");
ps.setString(1,skill);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString(2)%></td>
<td><%=rs.getInt(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getInt(5)%></td>
<td><%=rs.getInt(6)%></td>
<td><%=rs.getString(7)%></td>
</tr>
<%} %>
</table>
</body>
</html>