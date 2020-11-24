package com.jnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class DeleteEx {
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
			System.out.println("Delete for single");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("Enter your id:");
				int id=sc.nextInt();
				String delete="delete from Student1 where sid="+id;
				int a = st.executeUpdate(delete);
			}
			
			}
			}
			
