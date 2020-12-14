package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ManagerUpdateBean {
	private int id;
	private String name;
	private String password;
	private String email;
	private int salary;
	private String company_name;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
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
	public ManagerRegisterBean update(int id,String name,String email,int salary,String company_name,long phone,String address) throws ClassNotFoundException, SQLException {
			Connection con=ConnectionEst.Connectivity();
			PreparedStatement ps=con.prepareStatement("update manager set name=?,email=?,salary=?,company_name=?,phone=?,address=? where id=?");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setInt(3, salary);
			ps.setString(4, company_name);
			ps.setLong(5, phone);
			ps.setString(6, address);
			ps.setInt(7, id);
			int x=ps.executeUpdate();
			if(x!=0) {
					ManagerRegisterBean mrb=new ManagerRegisterBean();
					mrb.setId(id);
					mrb.setName(name);
					mrb.setEmail(email);
					mrb.setSalary(salary);
					mrb.setCompany_name(company_name);
					mrb.setPhone(phone);
					mrb.setAddress(address);
					return mrb;
			}
			else
					return null;
	}
}
