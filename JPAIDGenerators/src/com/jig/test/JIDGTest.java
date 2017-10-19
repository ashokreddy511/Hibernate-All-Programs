package com.jig.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jig.entites.Resource;
import com.jig.util.SessionFactoryRegistry;

public class JIDGTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionfactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Resource rc=new Resource();
			rc.setRes_st_dt(new Date());
			rc.setRole("documentation prepare");
			rc.setPercentage(100);
			session.save(rc);
			transaction.commit();
			
			transaction = session.beginTransaction();
			Resource rc1=new Resource();
			rc1.setRes_st_dt(new Date());
			rc1.setRole("documentation prepare");
			rc1.setPercentage(100);
			
			session.save(rc1);
			transaction.commit();
			
			transaction = session.beginTransaction();

			Resource rc2=new Resource();
			rc2.setRes_st_dt(new Date());
			rc2.setRole("documentation prepare");
			rc2.setPercentage(100);
			session.save(rc2);
			transaction.commit();
			
			transaction = session.beginTransaction();

			Resource rc4=new Resource();
			rc4.setRes_st_dt(new Date());
			rc4.setRole("documentation prepare");
			rc4.setPercentage(100);
			session.save(rc4);
			transaction.commit();

			transaction = session.beginTransaction();

			Resource rc5=new Resource();
			rc5.setRes_st_dt(new Date());
			rc5.setRole("documentation prepare");
			rc5.setPercentage(100);
			session.save(rc5);
			transaction.commit();

			
			transaction = session.beginTransaction();
			Resource rc3=new Resource();
			rc3.setRes_st_dt(new Date());
			rc3.setRole("documentation prepare");
			rc3.setPercentage(100);
			
			session.save(rc3);

			
			/*Appaintment appointment = new Appaintment();
			appointment.setAppointmrentNo("1");
			appointment.setAppointmentDate(new Date());
			appointment.setDoctor("dr.shamaram");
			appointment.setPacentName("gopal");
			appointment.setMpbile("8989898989");
			appointment.setMail("gopal.com");
			
			
			session.save(appointment);
*/
//			session.save(rc);
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
					System.out.println("sucess");
				} else {
					transaction.rollback();
				}
				session.close();
			}

			SessionFactoryRegistry.closeSessionFactory();
		}
	}
	

/*@GeneratedValue(strategy=GenerationType.TABLE)
Hibernate: select sequence_next_hi_value from hibernate_sequences where sequence_name = 'Resource' for update
Hibernate: insert into hibernate_sequences(sequence_name, sequence_next_hi_value) values('Resource', ?)
Hibernate: update hibernate_sequences set sequence_next_hi_value = ? where sequence_next_hi_value = ? and sequence_name = 'Resource'
Hibernate: insert into Resource (percentage, res_st_dt, role, resourceNo) values (?, ?, ?, ?)
*/
}
