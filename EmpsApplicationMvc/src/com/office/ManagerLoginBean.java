package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerLoginBean {
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
	public ManagerRegisterBean login(String email,String password) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEst.Connectivity();
		PreparedStatement ps=con.prepareStatement("select * from manager where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		ManagerRegisterBean mrb=new ManagerRegisterBean();
		if(rs.next()) {
				mrb.setId(rs.getInt(1));
				mrb.setName(rs.getString(2));
				mrb.setPassword(rs.getString(3));
				mrb.setEmail(rs.getString(4));
				mrb.setSalary(rs.getInt(5));
				mrb.setCompany_name(rs.getString(6));
				mrb.setPhone(rs.getLong(7));
				mrb.setAddress(rs.getString(8));
				return mrb;
		}
		else
				return null;
	}
}
