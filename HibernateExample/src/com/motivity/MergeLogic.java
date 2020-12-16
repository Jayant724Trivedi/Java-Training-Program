package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MergeLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Student s=new Student();
		s.setId(1023);
		s.setMarks(440);
		s=(Student)se.merge(s);
		tx.commit();
		System.out.println(s.getName()+" "+s.getMarks());
		se.close();
		sf.close();
	}
}
