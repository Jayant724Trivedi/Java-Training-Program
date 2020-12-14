package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LeaveApplyBean {
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
		public boolean leave(String employee_name,long phone,String email,String gender,int no_of_days,String date_of_leave,
								String designation,int eid) throws ClassNotFoundException, SQLException {
				Connection con=ConnectionEst.Connectivity();
				PreparedStatement ps=con.prepareStatement("insert into leaves(employee_name,phone,email,gender,no_of_days,date_of_leave,designation,eid) values(?,?,?,?,?,?,?,?)");
				ps.setString(1, employee_name);
				ps.setLong(2, phone);
				ps.setString(3, email);
				ps.setString(4, gender);
				ps.setInt(5, no_of_days);
				ps.setString(6, date_of_leave);
				ps.setString(7, designation);
				ps.setInt(8, eid);
				int x=ps.executeUpdate();
				if(x!=0) {
						return true;
				} else
						return false;	
		}
		public List<LeaveApplyBean> status(int eid) throws ClassNotFoundException, SQLException{
				Connection con=ConnectionEst.Connectivity();
				PreparedStatement ps=con.prepareStatement("select * from leaves where eid=?");
				ps.setInt(1, eid);
				ResultSet rs=ps.executeQuery();
				List<LeaveApplyBean> l=new ArrayList<>();
				while(rs.next()) {
						LeaveApplyBean lab=new LeaveApplyBean();
						lab.setLid(rs.getInt(1));
						lab.setEmployee_name(rs.getString(2));
						lab.setPhone(rs.getLong(3));
						lab.setEmail(rs.getString(4));
						lab.setGender(rs.getString(5));
						lab.setNo_of_days(rs.getInt(6));
						lab.setDate_of_leave(rs.getString(7));
						lab.setDesignation(rs.getString(8));
						lab.setStatus(rs.getString(9));
						lab.setManager_name(rs.getString(10));
						lab.setEid(rs.getInt(11));
						l.add(lab);
				}
				return l;
		}
}
