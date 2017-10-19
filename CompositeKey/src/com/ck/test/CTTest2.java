package com.ck.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ck.entites.ResouceAllocator;
import com.ck.entites2.ResouceAllocatorInf;
import com.ck.util.SessionFactoryRegistry;

public class CTTest2 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionfactory();
			session = sessionFactory.openSession();
		//	transaction = session.beginTransaction();
			
			/*ResouceAllocator rea = new ResouceAllocator();
			rea.setResouceNo(101);
			rea.setProjectNo(103);
			rea.setResAssign_state_dt(new Date());
			rea.setResAssign_end_dt(null);
			rea.setApp_percentage(104);
*/
			//session.save(rea);

			ResouceAllocator rea = new ResouceAllocator();
			rea.setResouceNo(100);
			rea.setProjectNo(102);
			ResouceAllocator res=(ResouceAllocator)session.get(ResouceAllocator.class,rea);
			System.out.println(res);
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
