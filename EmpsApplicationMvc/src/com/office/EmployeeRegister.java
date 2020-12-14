package com.office;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeRegister extends HttpServlet {
		public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		int salary=Integer.parseInt(request.getParameter("salary"));
		String company_name=request.getParameter("company_name");
		int age=Integer.parseInt(request.getParameter("age"));
		long phone=Long.parseLong(request.getParameter("phone"));
		String address=request.getParameter("address");
		
		boolean status=false;
		try {
				status=new EmployeeRegisterBean().register(name, password, email, salary, company_name, age, phone, address);
		} catch(Exception e) {
				e.printStackTrace();
		}
		if(status)
				response.sendRedirect("./employee_login.html?msg=registered successfully");
		else
				response.sendRedirect("./employee_register.html?msg=register failed");
	}	
}
