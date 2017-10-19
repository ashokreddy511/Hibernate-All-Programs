package com.cs.delegate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.context.internal.ManagedSessionContext;

import com.cs.dao.CollegeDao;
import com.cs.dao.StudentDao;
import com.cs.entity.College;
import com.cs.entity.Student;
import com.cs.util.SessionFactoryRegistory;

public class UniversityDelegate {
	public static int createCollege(Student student, College college) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		int studentNo = 0;
		int collegeCode = 0;
		boolean flag = false;
		try {
			/*session = SessionFactoryRegistory.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();*/
			/*
			 * sessionfactory=SessionFactoryRegistory.getSessionFactory();
			 * session=sessionfactory.openSession();
			 * transaction=session.beginTransaction();
			 */
			sessionFactory = SessionFactoryRegistory.getSessionFactory();
			session=sessionFactory.openSession();
			ManagedSessionContext.bind(session);
			transaction = session.beginTransaction();

			studentNo = StudentDao.saveStudent(student);

			college.setStudentNo(studentNo);
			collegeCode = CollegeDao.saveCollege(college);
			
			flag = true;
		
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
				ManagedSessionContext.unbind(sessionFactory);
			}

		}
		return collegeCode;
	}
}
