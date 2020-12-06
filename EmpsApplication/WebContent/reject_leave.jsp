<%@include file="connect.jsp"%>
<%
int id=Integer.parseInt(request.getParameter("id"));
ps = con.prepareStatement("update leaves set status=? where lid=?");
ps.setString(1, "Exceed the limit check and re-enter leaves");
ps.setInt(2, id);
int x= ps.executeUpdate();
if (x != 0)
	response.sendRedirect("view_leave.jsp?msg=rejected");
%>