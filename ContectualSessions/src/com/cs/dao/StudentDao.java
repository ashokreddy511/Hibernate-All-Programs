package com.cs.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cs.entity.Student;
import com.cs.util.SessionFactoryRegistory;

public class StudentDao {
	public static int saveStudent(Student student){
		int studentNo;
		SessionFactory factory=null;
		Session session=null;
		
		/*factory=SessionFactoryRegistory.getSessionFactory();
		session=factory.getCurrentSession();*/
		
		factory=SessionFactoryRegistory.getSessionFactory();
		session=factory.openSession();
		
		studentNo=(int) session.save(student);
		return studentNo;
	}
}
