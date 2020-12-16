package com.motivity;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Student s=new Student();
		s.setId(1024);
		s.setMarks(438);
		s.setName("shiva");
		Transaction tx=se.beginTransaction();
		Serializable ser=se.save(s);
		tx.commit();
		System.out.println(ser.toString());
		se.close();
		sf.close();
	}
}
