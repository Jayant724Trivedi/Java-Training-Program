package com.motivity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateLogic1 {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Query qr=se.createQuery("update Student s set s.marks=s.marks+? where s.id in(?,?)");
		qr.setParameter(0,10);
		qr.setParameter(1, 1023);
		qr.setParameter(2, 1024);
		qr.executeUpdate();
		tx.commit();
		se.close();
		sf.close();
	}
}
