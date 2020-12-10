package com.motivitylabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AppointmentBean {
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
	public boolean apply(String patient_name,long phone,String email,String gender,String blood_group,String specialist,
			String date_of_appointment,String time_of_appointment,int pid) throws ClassNotFoundException, SQLException {
			Connection con=ConnectionEx.Connectivity();
			PreparedStatement ps=con.prepareStatement("insert into appointment(patient_name,phone,email,gender,blood_group,specialist,date_of_appointment,time_of_appointment,pid) values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, patient_name);
			ps.setLong(2, phone);
			ps.setString(3, email);
			ps.setString(4, gender);
			ps.setString(5, blood_group);
			ps.setString(6, specialist);
			ps.setString(7, date_of_appointment);
			ps.setString(8, time_of_appointment);
			ps.setInt(9, pid);
			int x=ps.executeUpdate();
			if(x!=0)
				return true;
			else
				return false;
	}
	
	public List<AppointmentBean> status(int id) throws ClassNotFoundException, SQLException{
			Connection con=ConnectionEx.Connectivity();
			PreparedStatement ps=con.prepareStatement("select * from appointment where pid=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			ArrayList<AppointmentBean> l=new ArrayList<>();
			while(rs.next()) {
					AppointmentBean ab=new AppointmentBean();
					ab.setPatient_name(rs.getString(2));
					ab.setPhone(rs.getLong(3));
					ab.setEmail(rs.getString(4));
					ab.setGender(rs.getString(5));
					ab.setBlood_group(rs.getString(6));
					ab.setSpecialist(rs.getString(7));
					ab.setDate_of_appointment(rs.getString(8));
					ab.setTime_of_appointment(rs.getString(9));
					ab.setDoctor_name(rs.getString(10));
					ab.setStatus(rs.getString(11));
					l.add(ab);
			}
			
		return l;
	}
}
