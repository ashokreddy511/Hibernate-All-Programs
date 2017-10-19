package com.cs.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cs.entity.College;
import com.cs.util.SessionFactoryRegistory;

public class CollegeDao {
	public static int saveCollege(College college){
		int collegeCode;
		SessionFactory factory=null;
		Session session=null;
		
		/*factory=SessionFactoryRegistory.getSessionFactory();
		session=factory.getCurrentSession();
		*/
		factory=SessionFactoryRegistory.getSessionFactory();
		session=factory.openSession();
		collegeCode=(int) session.save(college);
		return collegeCode;
	}

}
