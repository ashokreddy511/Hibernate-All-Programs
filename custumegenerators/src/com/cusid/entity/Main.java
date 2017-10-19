package com.cusid.entity;
 
import com.cusid.entity.Customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class Main {
 
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Customer customer = new Customer();
        customer.setCustomerName("Chandra Shekhar");
        customer.setCity("Banglore");
        session.save(customer);
        tx.commit();
        
 
    }
}
 
