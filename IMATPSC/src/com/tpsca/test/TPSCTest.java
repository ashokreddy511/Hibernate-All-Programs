package com.tpsca.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpsca.entites.CardPayment;
import com.tpsca.entites.CheckPayment;
import com.tpsca.entites.Payment;
import com.tpsca.util.SessionFactoryRegistory;

public class TPSCTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tranaction = null;
		boolean flag = false;
		Payment payment = null;
		CardPayment cpayment = null;
		CheckPayment chpay = null;

		try {
			sessionFactory = SessionFactoryRegistory.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			tranaction = session.beginTransaction();
/*			payment = new Payment();

			payment.setDiscription("electrical");
			payment.setAmount(1234f);
			session.save(payment);

			cpayment = new CardPayment();
			cpayment.setDiscription("television");
			cpayment.setAmount(340f);
			cpayment.setCardNo(125);
			cpayment.setCardHolderName("ashok");
			cpayment.setCardType("visa");
			session.save(cpayment);

			chpay = new CheckPayment();
			chpay.setDiscription("netbill");
			chpay.setAmount(659f);
			chpay.setCheckAccountNo("125");
			chpay.setCheckDate(new Date());
			chpay.setCheckNo(14);
			session.save(chpay);*/
			//polimophism
			payment=(Payment) session.get(Payment.class,3);
			System.out.println(payment);
			
			/*chpay=(CheckPayment) session.get(CheckPayment.class,3);
			System.out.println(chpay);*/
			flag = true;
		} finally {
			if (tranaction != null) {
				if (flag) {
					tranaction.commit();
				} else {
					tranaction.rollback();
				}
			}
			SessionFactoryRegistory.closeSessionFactory();
		}

	}
}
