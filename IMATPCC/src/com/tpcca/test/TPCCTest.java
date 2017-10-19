package com.tpcca.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpcca.entity.CardPayment;
import com.tpcca.entity.CheckPayment;
import com.tpcca.entity.Payment;
import com.tpcca.util.SessionFactoryRegistory;

public class TPCCTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tranaction = null;
		boolean flag = false;
		Payment payment = null;
		CardPayment cpayment = null;
		CheckPayment chpay = null;
		int paymentNo = 0;
		try {
			sessionFactory = SessionFactoryRegistory.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			tranaction = session.beginTransaction();

			payment = new Payment();
			payment.setPaidDate(new Date());
			payment.setDiscription("electrical");
			payment.setAmount(1234f);
			paymentNo = (Integer) session.save(payment);
			System.out.println(paymentNo);

			
			  cpayment = new CardPayment(); cpayment.setPaidDate(new Date());
			  cpayment.setDiscription("electrical"); cpayment.setAmount(1234f);
			  cpayment.setCardNo(125); cpayment.setCardHOlder("ashok");
			  cpayment.setCardType("visa");
			  paymentNo=(Integer)session.save(cpayment);
			  System.out.println(paymentNo);
			  
			  
			  chpay = new CheckPayment(); chpay.setPaidDate(new Date());
			  chpay.setDiscription("netbill"); chpay.setAmount(659f);
			  chpay.setCheckDate(new Date()); chpay.setCheckDate(new Date());
			  chpay.setChackNo(14); paymentNo=(Integer)session.save(chpay);
			  System.out.println(paymentNo);
			
			  chpay=(CheckPayment) session.get(CheckPayment.class,3);
			  System.out.println(chpay);
			 
			flag = true;
		} finally {
			if (tranaction != null) {
				if (flag) {
				tranaction.commit();
				} else {
					tranaction.rollback();
				}
			}
		}
		SessionFactoryRegistory.closeSessionFactory();

	}
}
