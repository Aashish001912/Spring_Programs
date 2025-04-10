package com.aashish.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Eng")
public class Vechile
{
 @Autowired
 @Qualifier("dEngine")
  private IEngine iEngine;
  public Vechile()
  {
	  
  }
  public void journey(String startPlace,String destPlace)
  {
	iEngine.startEngine();
	System.out.println("Jounery Start from :"+startPlace);
	
	iEngine.stopEngine();
	System.out.println("Journey ended at :"+destPlace);
  }
}
