package com.motivitylabs;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class DoctorUpdate extends HttpServlet {
		public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			String password=request.getParameter("password");
			String email=request.getParameter("email");
			String phone=request.getParameter("phone");
			long mobile=Long.parseLong(phone);
			String specialisation=request.getParameter("specialisation");
			boolean status=false;
			DoctorUpdateBean dub=new DoctorUpdateBean();
			dub.setId(id);
			dub.setName(name);
			dub.setEmail(email);
			dub.setPhone(mobile);
			dub.setSpecialisation(specialisation);
			HttpSession hs=request.getSession();
			DoctorRegisterBean drb=null;
			try {
				drb=dub.update(id, name, password, email, mobile, specialisation);
			} catch(Exception e) {
				e.printStackTrace();
			}
			if(drb!=null) {
						hs.setAttribute("doctorDetails",drb);
						response.sendRedirect("doctor_profile.jsp?msg=updated successfully");
			} else {
						response.sendRedirect("./update_doctor_profile.jsp?msg=updated failed");
			}
		}	
}
