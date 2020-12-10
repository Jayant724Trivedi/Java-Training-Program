package com.motivitylabs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DoctorLoginBean {
private String email,password;

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public DoctorRegisterBean login(String email,String password) throws SQLException, ClassNotFoundException {
	Connection con=ConnectionEx.Connectivity();
	PreparedStatement ps=con.prepareStatement("select * from doctor where email=? and password=?");
	ps.setString(1, email);
	ps.setString(2, password);
	ResultSet rs=ps.executeQuery();
	DoctorRegisterBean drb=new DoctorRegisterBean();
	if(rs.next()) {
			drb.setId(rs.getInt("id"));
			drb.setName(rs.getString("name"));
			drb.setPassword(rs.getString("password"));
			drb.setEmail(rs.getString("email"));
			drb.setPhone(rs.getInt("phone"));
			drb.setSpecialisation(rs.getString("specialisation"));
			return drb;
	} else {
		return null;
		}
	}
}
