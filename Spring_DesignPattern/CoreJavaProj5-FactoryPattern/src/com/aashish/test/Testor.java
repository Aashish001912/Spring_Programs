package com.aashish.test;

import com.aashish.Factory.BikeFactory;
import com.aashish.comp.Bike;

public class Testor 
{
   public static void main(String[] args) 
   {
	Bike bike=BikeFactory.orderBike("Standard");
	bike.drive();
	
	System.out.println("===============================");
	
	Bike bike1=BikeFactory.orderBike("sports");
	bike1.drive();
	
	System.out.println("================================");
	
	Bike bike2=BikeFactory.orderBike("electric");
	bike2.drive();
	
	System.out.println("=================================");
	 
	Bike bike3=BikeFactory.orderBike("bullet");
	bike3.drive();
   }
}
