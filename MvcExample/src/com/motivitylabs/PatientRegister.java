package com.motivitylabs;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class PatientRegister extends HttpServlet {
	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
			String url="jdbc:mysql://localhost:3306/kims";
			String username="root";
			String password="root";
			try {
				con=DriverManager.getConnection(url,username,password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String address=request.getParameter("address");
		boolean status=false;
		PatientRegisterBean prb=new PatientRegisterBean();
		prb.setName(name);
		prb.setPassword(password);
		prb.setEmail(email);
		prb.setPhone(mobile);
		prb.setAddress(address);
		try {
			status=prb.register(name, password, email, mobile, address);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("./patient_login.html?msg=registered successfully");
		else
			response.sendRedirect("./patient_register.html?msg=registered failed");
	}
}
