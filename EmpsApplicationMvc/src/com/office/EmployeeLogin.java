package com.office;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeLogin extends HttpServlet {
		public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
				String email=request.getParameter("email");
				String password=request.getParameter("password");
				EmployeeRegisterBean erb=null;
				try {
						erb=new EmployeeLoginBean().login(email, password);
				} catch(Exception e) {
						e.printStackTrace();
				}
						HttpSession hs=request.getSession();
						if(erb!=null) {
								hs.setAttribute("employeeDetails", erb);
								hs.setAttribute("id", erb.getId());
								response.sendRedirect("./employee_home.html?msg=login successfully");
						}
						else
								response.sendRedirect("./employee_login.html?msg=login failed");
		}
}
