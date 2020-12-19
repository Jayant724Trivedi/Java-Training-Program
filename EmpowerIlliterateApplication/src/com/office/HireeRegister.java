package com.office;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HireeRegister extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String skill=request.getParameter("skill");
		int experience=Integer.parseInt(request.getParameter("experience"));
		int age=Integer.parseInt(request.getParameter("age"));
		String city=request.getParameter("city");
		boolean status=false;
		try {
			status=new HireeRegisterBean().register(name, mobile, skill, experience, age, city);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("./hiree_register_success.html?msg=registered sucessfully");
		else
			response.sendRedirect("./hiree_register.html?msg=register failed");
	}
}