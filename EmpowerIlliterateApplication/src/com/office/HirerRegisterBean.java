package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HirerRegisterBean {
		private int id;
		private String name;
		private String password;
		private long phone;
		private String organisation;
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public String getOrganisation() {
			return organisation;
		}
		public void setOrganisation(String organisation) {
			this.organisation = organisation;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public boolean register(String name,String password,long phone,String organisation,String city) throws ClassNotFoundException, SQLException {
				Connection con=ConnectionEst.Connectivity();
				PreparedStatement ps=con.prepareStatement("insert into hirer(name,password,phone,organisation,city) values(?,?,?,?,?)");
				ps.setString(1, name);
				ps.setString(2, password);
				ps.setLong(3, phone);
				ps.setString(4, organisation);
				ps.setString(5, city);
				int x=ps.executeUpdate();
				if(x!=0)
					return true;
				else
					return false;
		}
}
