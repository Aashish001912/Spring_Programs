package com.aashish.test;

import com.aashish.comp.Flipkart;
import com.aashish.factory.FlipkartFactory;

public class StrategyPatternTest 
{
  public static void main(String[] args) 
  {
	//use factory pattern to target class obj
	  Flipkart fpkt=FlipkartFactory.getInstance("bluedart");
	  
	  //invoke business method
	  String resultmsg=fpkt.shopping(new String[]{"Shirt", "trouser"},
			  new double[] {4000.0,2444.0});
	  
	  System.out.println(resultmsg);
	 
  }
}
