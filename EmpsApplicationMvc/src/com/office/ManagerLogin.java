package com.office;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ManagerLogin extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		ManagerRegisterBean mrb=null;
		try {
				mrb=new ManagerLoginBean().login(email, password);
		} catch(Exception e) {
				e.printStackTrace();
		}
				HttpSession hs=request.getSession();
				if(mrb!=null) {
						hs.setAttribute("managerDetails", mrb);
						hs.setAttribute("id", mrb.getId());
						hs.setAttribute("name",mrb.getName());
						response.sendRedirect("./manager_home.html?msg=login successfully");
				}
				else
						response.sendRedirect("./manager_login.html?msg=login failed");
	}
}
