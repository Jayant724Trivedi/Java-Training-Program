package com.motivitylabs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionEx {
	public static  Connection  Connectivity() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/kims";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		return con;
	}

	
}
