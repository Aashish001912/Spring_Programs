package com.nt.sbeans;

import java.time.LocalDate;

public class Seasons_Generator 
{
  private LocalDate date;

  public void setDate(LocalDate date)
  {
	this.date = date;
  }
  
  //Business Method
  public String showCurrentSeasons()
  {
	  int month=date.getMonthValue();
	  
	  if(month>=3 || month<=6)
	  {
		  return "Summer";
	  }
	  else if(month>=7 || month<=11)
	  {
		  return "Rainey";
	  }
	  else
	  {
		  return "Winter";
	  }
  }
  
  
  
}
