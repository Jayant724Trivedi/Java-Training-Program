package com.motivitylabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ViewAppointmentBean {
	private int aid;
	private String patient_name;
	private long phone;
	private String email;
	private String gender;
	private String blood_group;
	private String specialist;
	private String date_of_appointment;
	private String time_of_appointment;
	private String doctor_name;
	private String status;
	private int pid;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getDate_of_appointment() {
		return date_of_appointment;
	}
	public void setDate_of_appointment(String date_of_appointment) {
		this.date_of_appointment = date_of_appointment;
	}
	public String getTime_of_appointment() {
		return time_of_appointment;
	}
	public void setTime_of_appointment(String time_of_appointment) {
		this.time_of_appointment = time_of_appointment;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public List<ViewAppointmentBean> view(String specialist) throws ClassNotFoundException, SQLException{
			Connection con=ConnectionEx.Connectivity();
			PreparedStatement ps=con.prepareStatement("select * from appointment where specialist=?");
			ps.setString(1, specialist);
			ResultSet rs=ps.executeQuery();
			ArrayList<ViewAppointmentBean> l=new ArrayList<>();
			while(rs.next()) {
				ViewAppointmentBean vab=new ViewAppointmentBean();
				vab.setPid(rs.getInt(1));
				vab.setPatient_name(rs.getString(2));
				vab.setPhone(rs.getLong(3));
				vab.setEmail(rs.getString(4));
				vab.setGender(rs.getString(5));
				vab.setBlood_group(rs.getString(6));
				vab.setSpecialist(rs.getString(7));
				vab.setDate_of_appointment(rs.getString(8));
				vab.setTime_of_appointment(rs.getString(9));
				vab.setDoctor_name(rs.getString(10));
				vab.setStatus(rs.getString(11));
				l.add(vab);
			}
			return l;
	}
}
