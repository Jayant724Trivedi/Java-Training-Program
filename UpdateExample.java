package com.jnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateExample {
		public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/motivity";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);
			if (con != null)
				System.out.println("Connection established");
			Statement st = con.createStatement();
			System.out.println("Where to update:\n1. name:\n2.");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter Name:");
				String name = sc.next();
				name += " " + sc.next();
				System.out.println("Enter id:");
				int id = sc.nextInt();
				String update = "update Student1 set name='" + name + "' where sid=" + id;
				int a = st.executeUpdate(update);
				if (a != 0)
					System.out.println("Updated");
			}
		}
}

