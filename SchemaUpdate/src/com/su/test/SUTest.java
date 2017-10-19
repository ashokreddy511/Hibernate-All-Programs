package com.su.test;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sp.entities.Sparepart;
import com.su.util.SessionFatoryRegistory;

public class SUTest {
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
			sp.setSparepartNo(126);
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
