package com.motivitylabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DoctorUpdateBean {
	private int id;
	private String name;
	private String password;
	private String email;
	private long phone;
	private String specialisation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public DoctorRegisterBean update(int id,String name,String password,String email,long phone,String specialisation) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("update doctor set name=?,email=?,phone=?,specialisation=? where id=?");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setLong(3, phone);
		ps.setString(4, specialisation);
		ps.setInt(5, id);
		int x=ps.executeUpdate();
		DoctorRegisterBean drb=new DoctorRegisterBean();
		if(x!=0) {
		PreparedStatement ps1=con.prepareStatement("select * from doctor where id=?");
		ps1.setInt(1, id);
		ResultSet rs=ps1.executeQuery();
		if(rs.next()) {
				drb.setId(rs.getInt("id"));
				drb.setName(rs.getString("name"));
				drb.setPassword(rs.getString("password"));
				drb.setEmail(rs.getString("email"));
				drb.setPhone(rs.getInt("phone"));
				drb.setSpecialisation(rs.getString("specialisation"));
				return drb;
		}else {
				return null;
		}
		} else 
			return null;	
		}
}
