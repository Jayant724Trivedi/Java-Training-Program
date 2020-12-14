package com.office;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RejectLeave extends HttpServlet {
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				int id=Integer.parseInt(request.getParameter("id"));
				boolean status=false;
				try {
						status=new RejectLeaveBean().reject(id);
				} catch(Exception e) {
						e.printStackTrace();
				}
				if(status)
						response.sendRedirect("view_leave.jsp?msg=rejected");
	}
}
