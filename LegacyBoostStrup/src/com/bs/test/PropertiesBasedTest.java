package com.bs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bs.entite.Mechanic;
import com.bs.sessionfactry.PropertiesSessionFactry;

public class PropertiesBasedTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		/*sessionFactory = PropertiesSessionFactry.getSessionFactory();
		session = sessionFactory.openSession();
		session.get(Mechanic.class,7011);
*/		
		Transaction transaction = null;
		boolean flag = false;
		try{
		sessionFactory = PropertiesSessionFactry.getSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		Mechanic mechanic=new Mechanic();
		mechanic.setMechanicNo(1254);
		mechanic.setMechanicName("smith");
		mechanic.setLastName("steve");
		mechanic.setExperience(12);
		mechanic.setSpecialization("engine");
		mechanic.setContantNo("5689458");
		mechanic.setEmailaddress("smith@gmail.com");
		session.save(mechanic);
		flag = true;
		}finally{
			if(transaction!=null){
				if(flag){
					transaction.commit();
					System.out.println("sucessfull");
				}else{
					transaction.rollback();
				}
			}
			if(session!=null){
				session.close();
			}
		}
		PropertiesSessionFactry.closeSessionFactory();
	}
}
