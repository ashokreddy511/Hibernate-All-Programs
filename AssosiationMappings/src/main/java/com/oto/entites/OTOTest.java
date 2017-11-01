package com.oto.entites;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OTOTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		Candidate candidate = null;
		Evaluvation evaluvation = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();

			candidate = new Candidate();
			candidate.setApperDate(new Date());
			candidate.setApplyFor("sr.software");
			candidate.setCandidateName("ashok");
			candidate.setContactNo("9494752402");
			candidate.setEmail_Addess("ashpk@gamil.com");
			session.save(candidate);

			evaluvation = new Evaluvation();
			evaluvation.setEvaluvationDate(new Date());
			evaluvation.setInterviewerName("srinu");
			evaluvation.setRating("5");
			evaluvation.setCandidate(candidate);
			session.save(evaluvation);
			flag=true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
		}
		SessionFactoryRegistry.closeSessionFactory();
	}
}
