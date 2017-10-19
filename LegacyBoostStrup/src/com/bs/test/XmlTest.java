package com.bs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bs.entite.Mechanic;
import com.bs.sessionfactry.XmlSessionFactory;

public class XmlTest {
	public static void main(String[] args){
		SessionFactory sessionFactory=XmlSessionFactory.getSessionFactory();
		Session session=sessionFactory.openSession();
		Mechanic d=(Mechanic) session.get(Mechanic.class,5011);
		//System.out.println(d.getContact_no());
		System.out.println(d);
	}

}
