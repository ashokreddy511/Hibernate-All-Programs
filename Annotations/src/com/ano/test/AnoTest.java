package com.ano.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ano.entities.Sparepart;
import com.ano.util.SessionFatoryRegistory;

public class AnoTest {
	public static void main(String[] args) {
		SessionFactory facotry = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		try {
			facotry =SessionFatoryRegistory.getSessionFactory();
			session = facotry.openSession();
			transaction = session.beginTransaction();
			Sparepart sp = new Sparepart();
			sp.setSparepartNo(16);
			sp.setSparepartNm("gare");
			sp.setModelNo("m12547");
			sp.setPurchaseDt(new Date());
			sp.setPrice(2548);
			session.save(sp);
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
					System.out.println("insert data is success");
				} else {
					transaction.rollback();
					System.out.println("try again");
				}
			}
		}
	}
}
