package com.office;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ViewLeaveBean {
	private int lid;
	private String employee_name;
	private long phone;
	private String email;
	private String gender;
	private int no_of_days;
	private String date_of_leave;
	private String designation;
	private String status;
	private String manager_name;
	private int eid;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
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
	public int getNo_of_days() {
		return no_of_days;
	}
	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}
	public String getDate_of_leave() {
		return date_of_leave;
	}
	public void setDate_of_leave(String date_of_leave) {
		this.date_of_leave = date_of_leave;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public List<ViewLeaveBean> view(String designation) throws ClassNotFoundException, SQLException{
			Connection con=ConnectionEst.Connectivity();
			PreparedStatement ps=con.prepareStatement("select * from leaves where designation=?");
			ps.setString(1, designation);
			ResultSet rs=ps.executeQuery();
			List<ViewLeaveBean> l=new ArrayList<>();
			while(rs.next()) {
					ViewLeaveBean vlb=new ViewLeaveBean();
					vlb.setLid(rs.getInt(1));
					vlb.setEmployee_name(rs.getString(2));
					vlb.setPhone(rs.getLong(3));
					vlb.setEmail(rs.getString(4));
					vlb.setGender(rs.getString(5));
					vlb.setNo_of_days(rs.getInt(6));
					vlb.setDate_of_leave(rs.getString(7));
					vlb.setDesignation(rs.getString(8));
					vlb.setStatus(rs.getString(9));
					vlb.setManager_name(rs.getString(10));
					vlb.setEid(rs.getInt(11));
					l.add(vlb);
			}
			return l;
			}
	public int details(int id) throws ClassNotFoundException, SQLException {
			Connection con=ConnectionEst.Connectivity();
			PreparedStatement ps=con.prepareStatement("select * from employee where eid=?");
			ps.setInt(1, id);
			ResultSet rs1=ps.executeQuery();
			if(rs1.next()) {
					return rs1.getInt("no_of_leaves_taken");
			}
			return 0;
	}
}
