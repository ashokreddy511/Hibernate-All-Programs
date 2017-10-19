package com.flc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.event.spi.ClearEvent;

import com.flc.entites.Product;
import com.flc.util.SessionFactoryRegistory;

public class FLCTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryRegistory.getSessionfactory();
			session = sessionFactory.openSession();
			transaction=session.beginTransaction();

/*			
			  Product p=(Product) session.get(Product.class,1); 
			  Productp1=(Product) session.get(Product.class,1); 
			  the first time its go to database after the second request onwards it feat the data in
			  first level cache System.out.println(p==p1);*/
			 
			/*
			  we can fetch the data using accuser methods that time it goes to
			  database second time onwards it does not go to database fetch
			  from the data in first level cache 
			  
			  Product p2=(Product)session.load(Product.class,2); 
			  Product p3=(Product)session.load(Product.class,2);
			  System.out.println(p3.getProductName());
			  System.out.println(p3.getProductName());
			  System.out.println(p2==p3);
*/			 
/*			Product product=(Product)session.get(Product.class,2); 
 			the can fetch and store into the cache at first time
			  
			  product.setProductName("SAMSUNG GALAXY S8");
			  session.update(product);
			  
			  product.setDiscription("samsung galaxy s8+");
			  session.update(product);
			  
			  the above update commands are effected in cache after
			  transaction.commit() it effects on database at a time by
			  generating single qry itself
*/			 

/*			
			  Product product=(Product)session.get(Product.class,2);
			  System.out.println(product); 
			  
			  session.evict(product); in this case the specified data can be removed from the cache{1}
			  session.clear(); in this case the entire data can be removed fromthe cache{all} 
			  Product product1=(Product)session.get(Product.class,2);
			  System.out.println(product1);
			  System.out.println(product==product1);
			  
			  here the session.evict(product) and session.clear() both are useing the clear the cache 
			  the above case any one of the command using the it will generated the two qrys(both time go to the
			  database). 
			  if not using any one of the command it generates the one qry itself(it fetch from cache directly).
			  
	*/		 
			  Product product=new Product();
			  Product p=new Product(); 
			  p.setProductId(3); 
			  p.setProductName("Samsung Tv");
			  p.setDiscription("LED 24 inch"); p.setPrice(300000f);
			  session.save(p);
			  session.flush(); //it is useful to store the data in database temporally
			  p.setDiscription("LED 42 inch");
			  session.update(p);
/*
			
			  Product p=new Product(); insert and update quarry bother executed
			  p.setProductId(2); 
			  p.setProductName("Samsung Tv");
			  p.setDiscription("LED 24 inch"); p.setPrice(300000f);
			  session.save(p);
			  
			  p.setProductName("LG TV"); 
			  session.update(p);
			 
*/
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
			//		transaction.commit();
					System.out.println("sucess");
				} else {
					transaction.rollback();
				}
			}
			session.close();
		}
		SessionFactoryRegistory.closeSessionfactory();
	}
}
