package com.bs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bs.entite.Mechanic;
import com.bs.sessionfactry.ProgramaicSessionFactory;

public class ProgramaicTest {
public static void main(String[] args) {
	SessionFactory sessionFactory;
	Session session=null;
	sessionFactory=ProgramaicSessionFactory.getSessionFactory();
	session=sessionFactory.openSession();
	Mechanic m=(Mechanic) session.get(Mechanic.class,5011);
	
	System.out.println(m);
}
}
