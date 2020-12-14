package com.office;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ManagerRegister extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		int salary=Integer.parseInt(request.getParameter("salary"));
		String company_name=request.getParameter("company_name");
		long phone=Long.parseLong(request.getParameter("phone"));
		String address=request.getParameter("address");
		
		boolean status=false;
		try {
				status=new ManagerRegisterBean().register(name, password, email, salary, company_name, phone, address);
		} catch(Exception e) {
				e.printStackTrace();
		}
		if(status)
				response.sendRedirect("./manager_login.html?msg=registered successfully");
		else
				response.sendRedirect("./manager_register.html?msg=register failed");
	}	
}
