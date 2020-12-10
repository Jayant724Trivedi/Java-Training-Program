package com.motivitylabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientUpdateBean {
	private int id;
	private String name;
	private String password;
	private String email;
	private long phone;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public PatientRegisterBean update(int id,String name,String password,String email,long phone,String address) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("update patient set name=?,email=?,phone=?,address=? where id=?");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setLong(3, phone);
		ps.setString(4, address);
		ps.setInt(5, id);
		int x=ps.executeUpdate();
		PatientRegisterBean prb=new PatientRegisterBean();
		if(x!=0) {
		PreparedStatement ps1=con.prepareStatement("select * from patient where id=?");
		ps1.setInt(1, id);
		ResultSet rs=ps1.executeQuery();
		if(rs.next()) {
				prb.setId(rs.getInt("id"));
				prb.setName(rs.getString("name"));
				prb.setPassword(rs.getString("password"));
				prb.setEmail(rs.getString("email"));
				prb.setPhone(rs.getInt("phone"));
				prb.setAddress(rs.getString("address"));
				return prb;
		}else {
				return null;
		}
		} else 
			return null;	
		}
}
