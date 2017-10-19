package com.fph.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class FHPTest {
public static void main(String[] args) {
	Configuration con=new Configuration().configure();
	SessionFactory sf=con.buildSessionFactory();
	Session session=sf.openSession();
	Transaction transaction=session.beginTransaction();
	boolean flag=true;
	try{
	/*Mechanic mec=new Mechanic();
	mec.setMechanicNo(12);
	mec.setMechanicName("ashok");
	mec.setLastName("g");
	mec.setContantNo("4589678");
	mec.setEmailaddress("ashok@gmail");
	mec.setExperience(24);
	
	session.save(mec); it is work fine without wrote update command it updated
	mec.setContantNo("89898989");*/
		
		
	/*Mechanic mec1=new Mechanic();
	mec1.setMechanicNo(12);
	mec1.setMechanicName("gtyhfr");
	
		
	Mechanic mec=(Mechanic)session.get(Mechanic.class,12);
	mec.setContantNo("56589658");
	//session.update(mec1);/*NOnUniqueObjectException
	session.merge(mec1);
	
	it it overlaped with same primary key*/
		
		/*Mechanic mec=(Mechanic)session.get(Mechanic.class,12);
		System.out.println(mec);
		session.delete(mec);*/
		
	/*	Mechanic mec1=new Mechanic();
		mec1.setMechanicNo(12);
		session.save(mec1);
		mec1.setContantNo("48579658");*/
		/*
		 * ENTITY LIFE CYCLE
		 * Transient:	 * 
		 * THE DATA CANNOT BE ATTACHED IN THE SESSION OBJECT AND THE DATA CAN NOTBE THERE IN THE DATABASE
		 * THIS STAGE IS CALLED TRANSIENT
		 * Advisor advisor=new advisor();
		 * advisor.setAdvisorNo(124); this is transient state.
		 * 
		 * Persistence:-
		 * 
		 * the data can be attached to the session object and data available in the dab.
		 * this state is called persistence
		 *  Advisor advisor=new advisor();
		 * advisor.setAdvisorNo(124);
		 * session.save(advisor);
		 * transaction.commit();
		 * 
*/	
	flag=true;
	}finally{
		if(transaction!=null){
			if(flag){
				transaction.commit();
			}else{
				transaction.rollback();
			}
			session.close();
		}
		sf.close();
	}
	
}
}
