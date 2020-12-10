package com.motivitylabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PatientRegisterBean {
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
	public boolean register(String name,String password,String email,long phone,String address) throws ClassNotFoundException, SQLException {
			Connection con=ConnectionEx.Connectivity();
			PreparedStatement ps=con.prepareStatement("insert into patient(name,password,email,phone,address) values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setLong(4, phone);
			ps.setString(5, address);
			int x=ps.executeUpdate();
			if(x!=0)
					return true;
			else
					return false;		
	}
}
