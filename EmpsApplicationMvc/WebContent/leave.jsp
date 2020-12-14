<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO LEAVE  PAGE</h1></center>
<br><br><br>
<a href="employee_home.html">Home</a> |
<a href="employee_profile.jsp">Profile</a> |
<a href="leave.jsp">Leave Application</a> |
<a href="leave_status.jsp">Leave status</a> |
<a href="index.html">Logout</a>
<br><br><br>
<form action="apply_leave.jsp" align="center">
<input type="text" name="employee_name" placeholder="Enter employee name ">
<input type="number" name="phone" placeholder="Enter phone number">
<input type="email"  name="email" placeholder="Enter email">
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<input type="number" name="no_of_days" placeholder="Enter no of days">
<input type="date" name="date_of_leave" placeholder="select date to leave ">
<select name="designation">
<option value="Team Manager">Team Manager</option>
<option value="Project Manager">Project Manager</option>
</select>
<input type="submit" value="Apply"> 
</form>
</body>
</html>