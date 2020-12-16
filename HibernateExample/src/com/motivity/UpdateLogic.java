package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Student s=(Student) se.load(Student.class, 1024);
		s.setMarks(510);
		se.update(s);
		tx.commit();
		se.close();
		sf.close();
	}
}
