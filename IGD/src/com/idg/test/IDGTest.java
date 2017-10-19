package com.idg.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.idg.entity.Appaintment;
import com.idg.util.SessionFactoryRegistry;

public class IDGTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionfactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			Appaintment appointment = new Appaintment();
//			appointment.setAppointmrentNo("1");
			appointment.setAppointmentDate(new Date());
			appointment.setDoctor("dr.shamaram");
			appointment.setPacentName("gopal");
			appointment.setMpbile("8989898989");
			appointment.setMail("gopal.com");
			session.save(appointment);
					
			flag = true;
		} finally {
			if (transaction != null) {
				if(flag){
				transaction.commit();
				System.out.println("sucess");
				}else{
					transaction.rollback();
				}
				session.close();
			}
			
			SessionFactoryRegistry.closeSessionFactory();
		}
	}

}
