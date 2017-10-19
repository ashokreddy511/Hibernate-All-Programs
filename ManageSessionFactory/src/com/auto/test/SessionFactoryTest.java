package com.auto.test;

import com.auto.entites.SesionFactoryRegistry;
import com.auto.entites.Vehicle;
import com.auto.entites.VehicleDao;

public class SessionFactoryTest {
	public static void main(String[] args) {

		VehicleDao vd = new VehicleDao();

		Vehicle vehicle = new Vehicle();

		vehicle.setVehicleNo(1254);
		vehicle.setVehicleModelNO("honda");
		vehicle.setColor("red");
		vehicle.setVehiclePurchaseDate("2017-02-03");
		vehicle.setChasisNO("CT1205");
		vehicle.setEngineNo("E1254");
		vehicle.setRegistrationNo("124578");
		vehicle.setBatteryNo("B14528");

		vd.saveOperation(vehicle);
	
		System.out.println("insert done");
		

		Vehicle vehicle1=vd.getVehicle(1524);
		//System.out.println(Vehicle.class.getClassLoader().getClass());
		
		System.out.println(vehicle1.getVehicleNo());
		System.out.println(vehicle1.getVehicleModelNO());
		SesionFactoryRegistry.close();
	
	
	}
}
