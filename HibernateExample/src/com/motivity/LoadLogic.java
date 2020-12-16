package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoadLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Student s= (Student) se.load(Student.class, 1023);
		System.out.println(s.getId()+" "+s.getMarks()+" "+s.getName());
		s=(Student)se.load("com.motivity.Student", 1024);
		System.out.println(s.getId()+" "+s.getMarks()+" "+s.getName());
		se.close();
		sf.close();
	}
}
