package com.office;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ManagerUpdate extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		int salary=Integer.parseInt(request.getParameter("salary"));
		String company_name=request.getParameter("company_name");
		long phone=Long.parseLong(request.getParameter("phone"));
		String address=request.getParameter("address");
		ManagerRegisterBean mrb=null;
		try {
				mrb=new ManagerUpdateBean().update(id, name, email, salary, company_name, phone, address);
		} catch(Exception e) {
				e.printStackTrace();
		}
		HttpSession hs=request.getSession();
		if(mrb!=null) {
				hs.setAttribute("managerDetails", mrb);
				response.sendRedirect("./manager_profile.jsp?msg=updated successfully");
		}
		else
				response.sendRedirect("./update_manager_profile.jsp?id="+id+"msg=update failed");
	}
}
