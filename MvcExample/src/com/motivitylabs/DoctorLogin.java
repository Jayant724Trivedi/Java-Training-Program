package com.motivitylabs;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DoctorLogin extends HttpServlet {
public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	
	HttpSession hs=request.getSession();
	DoctorRegisterBean drb=null;
	
	try {
		drb=new DoctorLoginBean().login(email, password);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(drb!=null) {
		hs.setAttribute("doctorDetails", drb);
		hs.setAttribute("name", drb.getId());
		hs.setAttribute("name", drb.getName());
		hs.setAttribute("specialist",drb.getSpecialisation());
		response.sendRedirect("./doctor_home.html?msg=login successfully");
	}
	else {
		response.sendRedirect("./doctor_login.html?msg=login failed");
	}
}
}
