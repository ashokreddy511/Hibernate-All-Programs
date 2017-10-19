package com.hb.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb.trans.Advisor;

public class TrasactionTest {
	public static void main(String[] args) {
		boolean flag = false;
		Configuration cof = new Configuration().configure();
		SessionFactory sf = cof.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			Advisor advisor = new Advisor();
			advisor.setAdvisorNo(102);
			advisor.setFirstName("ashok");
			advisor.setLastName("G");
			advisor.setQualification("BA");
			advisor.setExperience("10");
			advisor.setContactNo("94947524");
			advisor.setEmailAddress("ashok@gamil.com");
			session.save(advisor);
			flag = true;
		} finally {
			if (session != null && transaction != null) {
				if (flag) {
					transaction.commit();
					System.out.println("ur data will be saved");

				} else {

					transaction.rollback();
					System.out.println("we find some proplem plz try again");

				}

			}
		}
	}

}
