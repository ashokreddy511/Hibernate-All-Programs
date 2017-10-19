package com.auto.entites;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VehicleDao {
	public void saveOperation(Vehicle vehicle) {
		boolean flag = false;
		/*
		  Configuration conf = new Configuration().configure(); 
		 	SessionFactory sf = conf.buildSessionFactory();
		 */
		SessionFactory sessionFactory=SesionFactoryRegistry.getcreate();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(vehicle);
			flag = true;
		} finally {
			if (session != null && transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}

			}

		}

	}

	public Vehicle getVehicle(int vehiNO) {
	/*	Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();*/
		SessionFactory sessionFactory=SesionFactoryRegistry.getcreate();
		Session session = sessionFactory.openSession();
		Vehicle vehicle = (Vehicle) session.get(Vehicle.class, vehiNO);
		return vehicle;
		
	}
}
