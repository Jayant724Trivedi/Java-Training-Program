package com.office;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AcceptLeave extends HttpServlet {
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				HttpSession hs=request.getSession();
				String name=(String)hs.getAttribute("name");
				int id=Integer.parseInt(request.getParameter("id"));
				int no_of_days=Integer.parseInt(request.getParameter("no_of_days"));
				int eid=Integer.parseInt(request.getParameter("eid"));
				boolean status=false;
				try {
						status=new AcceptLeaveBean().accept(name, id, no_of_days, eid);
				} catch(Exception e) {
						e.printStackTrace();
				}
				if(status)
						response.sendRedirect("view_leave.jsp?msg=accepted");
	}
}
