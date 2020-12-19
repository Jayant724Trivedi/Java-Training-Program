package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HirerLoginBean {
		private String name,password;

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
		public HirerRegisterBean login(String name,String password) throws ClassNotFoundException, SQLException {
			Connection con=ConnectionEst.Connectivity();
			PreparedStatement ps=con.prepareStatement("select * from hirer where name=? and password=?");
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			HirerRegisterBean hrb=new HirerRegisterBean();
			if(rs.next()) {
				hrb.setId(rs.getInt("id"));
				hrb.setName(rs.getString("name"));
				hrb.setPassword(rs.getString("password"));
				hrb.setPhone(rs.getInt("phone"));
				hrb.setOrganisation(rs.getString("organisation"));
				hrb.setCity(rs.getString("city"));
				return hrb;
		} else {
			return null;
			}
		}
}
