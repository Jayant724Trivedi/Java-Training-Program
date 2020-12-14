package com.office;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class EmployeeRegisterBean {
	private int id;
	private String name;
	private String password;
	private String email;
	private int salary;
	private String company_name;
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public boolean register(String name,String password,String email,int salary,String company_name,int age,long phone,String address) throws ClassNotFoundException, SQLException {
			Connection con=ConnectionEst.Connectivity();
			PreparedStatement ps=con.prepareStatement("insert into employee(name,password,email,salary,company_name,age,phone,address) values(?,?,?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setInt(4, salary);
			ps.setString(5, company_name);
			ps.setInt(6, age);
			ps.setLong(7, phone);
			ps.setString(8, address);
			int x=ps.executeUpdate();
			if(x!=0)
					return true;
			else
					return false;
	}
}
