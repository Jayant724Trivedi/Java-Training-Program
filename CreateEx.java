package com.jnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateEx {
			public static void main(String[] args) throws ClassNotFoundException, SQLException {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/motivity";
				String username = "root";
				String password = "root";
				Connection con = DriverManager.getConnection(url, username, password);
				if (con != null)
					System.out.println("Connection established");
				Statement st = con.createStatement();
				int a = st.executeUpdate("create table Student1(id int(10),name varchar(50),marks int(10),section varchar(50))");
				if (a == 0)
					System.out.println("created");
			}

		}



