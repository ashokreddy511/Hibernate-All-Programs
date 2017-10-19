package com.tpsc.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpsc.entites.CardPayment;
import com.tpsc.entites.CheckPayment;
import com.tpsc.entites.Payment;
import com.tpsc.util.SessionFactoryRegistory;

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
		/*	payment = new Payment();

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
			SessionFactoryRegistory.closeSessionFactory();
		}

	}
}
