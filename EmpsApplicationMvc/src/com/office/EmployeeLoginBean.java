package com.office;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeLoginBean {
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EmployeeRegisterBean login(String email,String password) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEst.Connectivity();
		PreparedStatement ps=con.prepareStatement("select * from employee where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		EmployeeRegisterBean erb=new EmployeeRegisterBean();
		if(rs.next()) {
				erb.setId(rs.getInt(1));
				erb.setName(rs.getString(2));
				erb.setPassword(rs.getString(3));
				erb.setEmail(rs.getString(4));
				erb.setSalary(rs.getInt(5));
				erb.setCompany_name(rs.getString(6));
				erb.setAge(rs.getInt(7));
				erb.setPhone(rs.getLong(8));
				erb.setAddress(rs.getString(9));
				return erb;
		}
		else
				return null;
	}
}
