package com.aashish.factory;

import com.aashish.comp.BlueDart;
import com.aashish.comp.Courier;
import com.aashish.comp.DTDC;
import com.aashish.comp.Flipkart;

public class FlipkartFactory 
{
  //static factory method having factory pattern logic
  public static Flipkart getInstance(String courierType)
  {
	  //Create Dependent class obj
	  Courier courier=null;
	  if(courierType.equalsIgnoreCase("dtdc"))
		  courier=new DTDC();
	  else if(courierType.equalsIgnoreCase("bluedart"))
		  courier=new BlueDart();
	  else 
		  throw new IllegalArgumentException(); 
	  
	  //create target class obj
	  Flipkart fpkt=new Flipkart();
	  
	  //Assign dependent class object to target class obj
	  fpkt.setCourier(courier);
	return fpkt;
	  
  }
}
