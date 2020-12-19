package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class HireeRegisterBean {
	private int id;
	private String name;
	private long phone;
	private String skill;
	private int experience;
	private int age;
	private String city;
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean register(String name,long phone, String skill, int experience, int age, String city) throws Exception {
		Connection con=ConnectionEst.Connectivity();		
		PreparedStatement ps=con.prepareStatement("insert into hiree(name, phone, skill, experience, age, city) values(?,?,?,?,?,?)");
		ps.setString(1,name);
		ps.setLong(2, phone);
		ps.setString(3,skill);
		ps.setInt(4, experience);
		ps.setLong(5, age);
		ps.setString(6,city);
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}
}