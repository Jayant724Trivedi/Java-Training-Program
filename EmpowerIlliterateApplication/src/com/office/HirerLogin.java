package com.office;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class HirerLogin extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		HirerRegisterBean hrb=null;
		
		try {
			hrb=new HirerLoginBean().login(name, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                 HttpSession hs=request.getSession();
		if(hrb!=null) {
			hs.setAttribute("hirerDetails", hrb);
			hs.setAttribute("id", hrb.getId());
			hs.setAttribute("name", hrb.getName());
			hs.setAttribute("organisation",hrb.getOrganisation());
			response.sendRedirect("./hirer_home.html?msg=login successfully");
		}
		else {
			response.sendRedirect("./hirer_login.html?msg=login failed");
		}
	}
}