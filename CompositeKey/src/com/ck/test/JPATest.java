package com.ck.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ck.entites.JPAResource;
import com.ck.entites.JPAResourceid;
import com.ck.util.SessionFactoryRegistry;

public class JPATest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionfactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			/*JPAResourceid rea = new  JPAResourceid();
			rea.setResouceNo(100);
			rea.setProjectNo(102);
			JPAResource res=new JPAResource();
			res.setId(rea);
			res.setResAssign_state_dt(new Date());
			res.setApp_percentage(100);
			session.save(res);*/
			
			JPAResourceid rea = new  JPAResourceid();
			rea.setResouceNo(100);
			rea.setProjectNo(102);
			
			JPAResource res=new JPAResource();
			res.setId(rea);
			JPAResource identifier=(JPAResource)session.get(JPAResource.class,rea);
			System.out.println(identifier);
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

}
