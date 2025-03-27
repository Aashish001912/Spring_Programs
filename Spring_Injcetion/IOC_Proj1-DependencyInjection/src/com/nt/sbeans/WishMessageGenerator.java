package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator 
{
  //HAS-A Property(composition)
  private LocalTime time;

  // setter method for setter injection
  public void setTime(LocalTime time) 
  {
	  System.out.println("WishMessageGenerator.setTime()");
	this.time = time;
  }
  
  //Business Method
  public String showWishMessageGenerator(String user)
  {
	  //get current hour of the day
	  int hour=time.getHour();
	  
	  //generate the wish message
	  if(hour<12)
		  return "Good Morning :"+user;
	  else if(hour<16)
		  return "Good Afternoon :"+user;
	  else if(hour<18)
		  return "Good Evening :"+user;
	  else
		  return "Good Night :"+user;
  }
  

}
