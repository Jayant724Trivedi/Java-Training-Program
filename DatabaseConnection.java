package com.jnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DatabaseConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println(con);
		if(con!=null) {
			System.out.println("Connection established");
		}
		Statement st=con.createStatement();
		System.out.println(st);
		ResultSet rs=st.executeQuery("select sid,marks from Student");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getInt(2));
		}

	}

}
