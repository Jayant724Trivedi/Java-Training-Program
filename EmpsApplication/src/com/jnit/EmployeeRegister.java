package com.jnit;
import java.io.IOException;
import java.io.PrintWriter;
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
public class EmployeeRegister extends HttpServlet {
	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
			String url="jdbc:mysql://localhost:3306/emps";
			String username="root";
			String password="root";
			try {
				con=DriverManager.getConnection(url,username,password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		int salary=Integer.parseInt(request.getParameter("salary"));
		String company_name=request.getParameter("company_name");
		int age=Integer.parseInt(request.getParameter("age"));
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String address=request.getParameter("address");
		PrintWriter pw=response.getWriter();	
		String sql="insert into employee(name,password,email,salary,company_name,age,phone,address) values(?,?,?,?,?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setInt(4,salary );
			ps.setString(5, company_name);
			ps.setInt(6, age);
			ps.setLong(7, mobile);
			ps.setString(8, address);
			pw.println("<html><body bgcolor='wheat'><center><h1>");
			int x=ps.executeUpdate();
			if(x!=0)
				pw.println("Employee entry registered successfully");
			pw.println("</h1></center></body></html>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

