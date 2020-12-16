package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdateLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Student s=new Student();
		s.setId(1025);
		s.setMarks(530);
		s.setName("ravi kumar");
		Transaction tx=se.beginTransaction();
		se.saveOrUpdate(s);
		tx.commit();
		se.close();
		sf.close();
	}
}
