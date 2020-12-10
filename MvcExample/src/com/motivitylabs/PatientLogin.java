package com.motivitylabs;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class PatientLogin extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			
			HttpSession hs=request.getSession();
			PatientRegisterBean prb=null;
			try {
				prb=new PatientLoginBean().login(email, password);
			} catch(Exception e) {
				e.printStackTrace();
			}
			if(prb!=null) {
					hs.setAttribute("patientDetails", prb);
					hs.setAttribute("id", prb.getId());
					response.sendRedirect("./patient_home.html?msg=login successfully");
			}
			else
					response.sendRedirect("./patient_login.html?msg=login failed");	
	}
}
