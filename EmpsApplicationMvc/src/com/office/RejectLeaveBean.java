package com.office;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class RejectLeaveBean {
		private int id;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		public boolean reject(int id) throws ClassNotFoundException, SQLException {
				Connection con=ConnectionEst.Connectivity();
				PreparedStatement ps=con.prepareStatement("update leaves set status=? where lid=?");
				ps.setString(1, "Exceed the limit check and re-enter leaves");
				ps.setInt(2, id);
				int x=ps.executeUpdate();
				if(x!=0)
						return true;
				else
						return false;
		}
}
