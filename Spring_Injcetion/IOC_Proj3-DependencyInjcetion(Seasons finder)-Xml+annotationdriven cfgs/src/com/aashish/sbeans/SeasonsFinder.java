package com.aashish.sbeans;

import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonsFinder 
{
	private LocalDate date;// HAS-A property composition

	public SeasonsFinder()
	{
		
	}

	//setter method for setter injection
	@Autowired
	public void setDate(LocalDate date) {
		this.date = date;
	}
	//Business method
	public String showSeasonName()
	{
		//get current month of the year
		int month=this.date.getMonthValue();
		if(month>=3 && month<=6)
		{
			return "Summer Seasons";
		}
		else if(month>=7 && month<=10)
		{
			return "Rainy Seasons";
		}
		else
			return "Winter Seasons";
	}
	
}
