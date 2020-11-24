package com.jnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SelectExample {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/motivity";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);
			if (con != null)
				System.out.println("Connection established");
			Statement st = con.createStatement();
			String orderby="select * from Student1";
			ResultSet rs=st.executeQuery(orderby);
			System.out.println("Student id     ||     Student Name     ||     Student Marks     ||     Student Section");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"     ||     "+rs.getString(2)+"     ||     "+rs.getInt(3)+"     ||     "+rs.getString(4));
			}
		}

	}


