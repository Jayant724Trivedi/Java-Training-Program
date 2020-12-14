package com.office;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Leave extends HttpServlet {
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String employee_name=request.getParameter("employee_name");
				long phone=Long.parseLong(request.getParameter("phone"));
				String email=request.getParameter("email");
				String gender=request.getParameter("gender");
				int no_of_days=Integer.parseInt(request.getParameter("no_of_days"));
				String date_of_leave=request.getParameter("date_of_leave");
				String designation=request.getParameter("designation");
				HttpSession hs=request.getSession();
				int eid=(Integer)hs.getAttribute("id");
				boolean status=false;
				try {
						status=new LeaveApplyBean().leave(employee_name, phone, email, gender, no_of_days, date_of_leave, designation, eid);
				} catch(Exception e) {
						e.printStackTrace();
				}
				if(status)
						response.sendRedirect("leave.jsp?msg=applied successfully");
				else
						response.sendRedirect("leave.jsp?msg=applied failed");
	}
}
