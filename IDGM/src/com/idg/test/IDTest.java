package com.idg.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.idg.entity.Appaintment;
import com.idg.util.SessionFactoryRegistroy;

public class IDTest {
public static void main(String[] args) {
	SessionFactory sessionFactory=null;
	Session session=null;
	Transaction  transaction=null;
	
	boolean flag=false;
	try {
		sessionFactory=SessionFactoryRegistroy.getSessionFactory();
		session=sessionFactory.openSession();
	    transaction=session.beginTransaction();
		
	    Appaintment appaintment=new Appaintment();
		appaintment.setAppointmentDate(new Date());
		appaintment.setDoctor("tiru");
		appaintment.setPacentName("giru");
		appaintment.setMobileNo("98786758");
		appaintment.setMail("giru34.com");
		session.save(appaintment);
		
		flag=true;
	}
	finally {
		if(transaction !=null) {
			if(flag) {
				transaction.commit();
				System.out.println("sussfullycom");
			}
			
		session.close();
	}
		//SessionFactoryRegistry.closeSessionFactory();
		
		
	}
	
}

}
