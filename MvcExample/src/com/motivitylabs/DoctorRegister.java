package com.motivitylabs;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DoctorRegister extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String specialisation=request.getParameter("specialisation");
		boolean status=false;
		DoctorRegisterBean drb=new DoctorRegisterBean();
		drb.setName(name);
		drb.setPassword(password);
		drb.setEmail(email);
		drb.setPhone(mobile);
		drb.setSpecialisation(specialisation);
		try {
			status=drb.register(name, password, email, mobile, specialisation);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("./doctor_login.html?msg=registered successfully");
		else
			response.sendRedirect("./doctor_register.html?msg=registered failed");
	}
}
