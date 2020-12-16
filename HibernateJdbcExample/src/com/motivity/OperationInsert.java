package com.motivity;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class OperationInsert {
		public static void insert() throws Exception {
				Session se=ConfigEst.config();
				Scanner sc=new Scanner(System.in);
				String choice="";
				do {
						Transaction tx=se.beginTransaction();
						Employee e=new Employee();
						System.out.println("Enter employee id:");
						e.setId(sc.nextInt());
						System.out.println("Enter employee name:");
						e.setName(sc.next());
						System.out.println("Enter employee salary:");
						e.setSalary(sc.nextInt());
						System.out.println("Enter employee department:");
						e.setDepartment(sc.next());
						System.out.println("Enter employee designation:");
						e.setDesignation(sc.next());
						System.out.println("Enter employee address:");
						e.setAddress(sc.next());
						System.out.println("Enter employee phone no:");
						e.setPhone(sc.next());
						System.out.println("Enter the date of joining:");
						e.setDOJ(sc.next());
						Serializable s=se.save(e);
						tx.commit();
						if(s.hashCode()>0) {
								System.out.println("Record Inserted");
						}
						System.out.println("Do you want to continue(y/n):");
						choice=sc.next();
				}while(choice.equalsIgnoreCase("y"));
				se.close();
		}
}
