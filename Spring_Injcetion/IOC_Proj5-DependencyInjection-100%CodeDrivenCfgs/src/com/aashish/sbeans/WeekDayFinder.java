//WeekDayFinder(target spring bean class)

package com.aashish.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder 
{
  @Autowired //field Injection
  private LocalDate date;//HAS-A Property
  public WeekDayFinder()
  {
	  System.out.println("WeekDayFinder::0-Param constructor");
	  
  }
  
  //Business Method
  public String showMessageOnDayTheWeek(String user)
  {
	  int week=date.getDayOfWeek().getValue();//gives 1(Monday) to 7(Sunday)number
	  if(week>=1 && week<=5)
		  return "Its WeekDay Work Hard "+user;
	  else
		  return "Relax"+user;
  }
}
