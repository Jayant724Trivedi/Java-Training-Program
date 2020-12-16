package com.motivity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ParticularIdLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Query qr=se.createQuery("select s.id from Student s");
		List li=qr.list();
		Iterator i=li.iterator();
		while(i.hasNext()) {
				Integer s=(Integer)i.next();
				System.out.println(s.intValue());		
		}
		tx.commit();
		se.close();
		sf.close();
	}
}
