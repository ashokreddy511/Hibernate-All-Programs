package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Moter;

public class Test {
	public static void main(String[] args) {
		//System.out.println(123);
		Configuration config=new Configuration().configure();
		
		SessionFactory fatory=config.buildSessionFactory();
	
		Session session=fatory.openSession();
		Transaction tx=session.beginTransaction();
		boolean flag=false;
		try{
		Moter m=new Moter();
		m.setMoterId(11);
		m.setModerName("Threephase Induction moter");
		m.setMoterModel("tata");
		session.save(m);
		flag=true;
		}finally{
			if(tx!=null){
			if(flag){
				tx.commit();
			}else{
				tx.rollback();
			}
		}
	}
}}


