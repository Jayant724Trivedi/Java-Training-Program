package com.motivitylabs;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class PatientUpdate extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String address=request.getParameter("address");
		boolean status=false;
		PatientUpdateBean pub=new PatientUpdateBean();
		pub.setId(id);
		pub.setName(name);
		pub.setEmail(email);
		pub.setPhone(mobile);
		pub.setAddress(address);
		HttpSession hs=request.getSession();
		PatientRegisterBean prb=null;
		try {
			prb=pub.update(id, name, password, email, mobile, address);
		} catch(Exception e) {
			e.printStackTrace();
		}
		if(prb!=null) {
					hs.setAttribute("patientDetails",prb);
					response.sendRedirect("patient_profile.jsp?msg=updated successfully");
		} else 
					response.sendRedirect("./update_patient_profile.jsp?msg=updated failed");
	}
}	
