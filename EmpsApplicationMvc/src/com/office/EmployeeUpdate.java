package com.office;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class EmployeeUpdate extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		int salary=Integer.parseInt(request.getParameter("salary"));
		String company_name=request.getParameter("company_name");
		int age=Integer.parseInt(request.getParameter("age"));
		long phone=Long.parseLong(request.getParameter("phone"));
		String address=request.getParameter("address");
		EmployeeRegisterBean erb=null;
		try {
				erb=new EmployeeUpdateBean().update(id, name, password, email, salary, company_name, age, phone, address);
		} catch(Exception e) {
				e.printStackTrace();
		}
		HttpSession hs=request.getSession();
		if(erb!=null) {
				hs.setAttribute("employeeDetails", erb);
				response.sendRedirect("./employee_profile.jsp?msg=updated successfully");
		}
		else
				response.sendRedirect("./update_employee_profile.jsp?id="+id+"msg=update failed");
	}
}
