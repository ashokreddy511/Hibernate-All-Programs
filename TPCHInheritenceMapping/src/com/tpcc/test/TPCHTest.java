package com.tpcc.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.context.spi.CurrentSessionContext;

import com.tpch.entites.Account;
import com.tpch.entites.CurrentAccount;
import com.tpch.entites.SavingAccount;
import com.tpch.util.SessionFactoryRegistory;

public class TPCHTest {
	public static void main(String[] args) {
	SessionFactory sessionFactory=null;
	Transaction transection=null;
	Session session=null;
	boolean flag=false;
	Account account=null;
	SavingAccount savingaccount=null;
	CurrentAccount current=null;
	
	try{
		sessionFactory=SessionFactoryRegistory.getSessionFactory();
		session=sessionFactory.getCurrentSession();
		transection=session.beginTransaction();
		account=new Account();
		account.setAccountHolder("ashokreddy");
		account.setOpenDate(new Date());
		account.setBalance(12000);
		session.save(account);
		
		savingaccount=new SavingAccount();
		savingaccount.setMinBalance(4000);
		savingaccount.setAccountHolder("srinu");
		savingaccount.setOpenDate(new Date());
		savingaccount.setBalance(15200);
		savingaccount.setHasCheckFault(true);
		savingaccount.setWithdraw(2500);
		session.save(savingaccount);
		
		
		current=new CurrentAccount();
		current.setAccountHolder("pinkey");
		current.setOpenDate(new Date());
		current.setBalance(15200);
		current.setOverDraftLimit(1542);
		current.setAnnualCharge(1520);
		session.save(current);
		
		Account account1=(Account)session.get(Account.class,2);
		System.out.println(account1.getClass().getName());
		System.out.println(account1);
		flag=true;
	}finally{
		if(transection!=null){
			if(flag){
				transection.commit();
			}else{
				transection.rollback();
			}
		}
	}
	SessionFactoryRegistory.closeSessionFactory();
			
}
}
