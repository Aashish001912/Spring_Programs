package com.aashish.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wd")
public class WeekDayOrWeekEndFinder 
{
	private LocalDate date;// HAS-A property composition

	public WeekDayOrWeekEndFinder()
	{
		
	}

	//setter method for setter injection
	@Autowired
	public void setDate(LocalDate date) {
		this.date = date;
	}
	//Business method
	public String getWeekDayOrWeekend()
	{
		
		DayOfWeek dayOfWeek=date.getDayOfWeek();
		if(dayOfWeek==DayOfWeek.SATURDAY || dayOfWeek==DayOfWeek.SUNDAY)
		{
			return "Its Weekend";
		}
		
		else
			return "Its WeekDay";
	}
	
}
