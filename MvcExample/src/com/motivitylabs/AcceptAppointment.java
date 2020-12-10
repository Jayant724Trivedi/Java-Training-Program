package com.motivitylabs;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class AcceptAppointment extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession hs=request.getSession();
		String name=(String)hs.getAttribute("name");
		int aid=Integer.parseInt(request.getParameter("id"));
		boolean status=false;
		try {
			status=new AcceptBean().accept(name, aid);
		} catch(Exception e) {
			e.printStackTrace();
		}
		if(status)
				response.sendRedirect("view_appointment.jsp?msg=accepted");
	}
}
