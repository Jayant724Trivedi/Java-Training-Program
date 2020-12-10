package com.motivitylabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AcceptBean {
	public String name;
	public String status;
	public int aid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public boolean accept(String name,int aid) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEx.Connectivity();
		PreparedStatement ps=con.prepareStatement("update appointment set name=?,status=? where aid=?");
		ps.setString(1, "Accepted");
		ps.setString(2, name);
		ps.setInt(3, aid);
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}
}
