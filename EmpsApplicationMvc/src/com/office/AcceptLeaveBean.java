package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AcceptLeaveBean {
		private String name;
		private int id;
		private int no_of_days;
		private int eid;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getNo_of_days() {
			return no_of_days;
		}
		public void setNo_of_days(int no_of_days) {
			this.no_of_days = no_of_days;
		}
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public boolean accept(String name,int id,int no_of_days,int eid) throws ClassNotFoundException, SQLException {
				Connection con=ConnectionEst.Connectivity();
				PreparedStatement ps=con.prepareStatement("update leaves set status=?,name=? where lid=?");
				ps.setString(1, "Accepted");
				ps.setString(2, name);
				ps.setInt(3, id);
				int x=ps.executeUpdate();
				if(x!=0) {
						PreparedStatement ps1=con.prepareStatement("update employee set no_of_leaves_taken=no_of_leaves_taken+? where eid=?");
						ps1.setInt(1, no_of_days);
						ps1.setInt(2, eid);
						x=ps1.executeUpdate();
						if(x!=0)
								return true;
						else
								return false;
				}else
								return false;
		}
}
