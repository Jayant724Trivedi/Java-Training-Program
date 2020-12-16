package com.motivity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DisplayLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Query qr=se.createQuery("from Student s");
		List<Student> li=qr.list();
		Iterator<Student> i=li.iterator();
		while(i.hasNext()) {
				Student s= i.next();
				System.out.println(s.getId()+" "+s.getMarks()+" "+s.getName());
		}
		tx.commit();
		se.close();
		sf.close();
	}
}
