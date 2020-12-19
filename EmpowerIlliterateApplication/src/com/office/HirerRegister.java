package com.office;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HirerRegister extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String organisation=request.getParameter("organisation");
		String city=request.getParameter("city");
		boolean status=false;
		HirerRegisterBean hrb=new HirerRegisterBean();
		hrb.setName(name);
		hrb.setPassword(password);
		hrb.setPhone(mobile);
		hrb.setOrganisation(organisation);
		hrb.setCity(city);
		try {
			status=hrb.register(name,password, mobile, organisation, city);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("./hirer_login.html?msg=registered successfully");
		else
			response.sendRedirect("./hirer_register.html?msg=registered failed");
	}
}