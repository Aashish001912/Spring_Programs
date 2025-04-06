package com.aashish.Factory;

import com.aashish.comp.Bike;
import com.aashish.comp.BulletBike;
import com.aashish.comp.ElectricBike;
import com.aashish.comp.SportsBike;
import com.aashish.comp.StandardBike;

public class BikeFactory 
{
  //Static factory method having factory pattern like
	public static Bike orderBike(String type) 
	{
		Bike bike=null;
		if(type.equalsIgnoreCase("standard"))
		 bike=new StandardBike();
		else if(type.equalsIgnoreCase("sports"))
			bike=new SportsBike();
		else if(type.equalsIgnoreCase("bullet"))
			bike=new BulletBike();
		else if(type.equalsIgnoreCase("electric"))
			bike=new ElectricBike();
		else
			throw new IllegalArgumentException("Invalid Bike type");
		return bike;
	}
}
