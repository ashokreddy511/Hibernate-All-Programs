package com.otomto.entites;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OtoOMtoOTest {
public static void main(String[] args) {
	SessionFactory sessionFactory=null;
	Session session=null;
	Transaction transation=null;
	Account account=null;
	Organization organization=null;
	boolean flag=false;
	try{
		sessionFactory=SessionFactoryRegistry.getSessionFactory();
		session=sessionFactory.getCurrentSession();
		transation=session.beginTransaction();
		
		organization=new Organization();
		organization.setEstablishingDate(new Date());
		organization.setOrganizationName("StackSpace");
		organization.setDescription("software Engineer");
		organization.setBusinessType("IT");
		session.save(organization);
		
		account=new Account();
		account.setOpenDate(new Date());
		account.setContactPerson("Sriman");
		account.setContactNo("9494752402");
		account.setEmail_Address("sriman@gmail.com");
		account.setOrganization(organization);
		session.save(account);
	
		account=(Account) session.get(Account.class,1);
		System.out.println(account);
		flag=true;
	}finally{
		if(transation!=null){
			if(flag){
				transation.commit();
			}else{
				transation.rollback();
			}
		}
	}
}
}
