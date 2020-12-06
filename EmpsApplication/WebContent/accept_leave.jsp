<%@include file="connect.jsp"%>
<%
int id=Integer.parseInt(request.getParameter("id"));
int no_of_days=Integer.parseInt(request.getParameter("no_of_days"));
int eid=Integer.parseInt(request.getParameter("eid"));
String name=(String) session.getAttribute("name");
ps = con.prepareStatement("update leaves set status=?,manager_name=? where lid=?");
ps.setString(1, "Accepted");
ps.setString(2, name);
ps.setInt(3, id);
int x= ps.executeUpdate();
if (x != 0){
	ps=con.prepareStatement("update employee set no_of_leaves_taken=no_of_leaves_taken+? where eid=?");
	ps.setInt(1,no_of_days);
	ps.setInt(2,eid);
	x=ps.executeUpdate();
	if(x!=0)
	response.sendRedirect("view_leave.jsp?msg=accepted");
}
%>