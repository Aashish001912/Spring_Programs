package com.aashish.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aashish.config.AppConfig;
import com.aashish.sbeans.WeekDayFinder;

public class DependencyInjectionTestor 
{
	public static void main(String[] args) 
	{
     //Create IOC Container
	AnnotationConfigApplicationContext ctx=
			new AnnotationConfigApplicationContext(AppConfig.class);
	
	//Get Target Spring bean class obj ref
	WeekDayFinder finder=(WeekDayFinder)ctx.getBean("wdf");
	
	//invoke the business method
	String msg=finder.showMessageOnDayTheWeek("Aashish");
	System.out.println(msg);
	
	//close the container
	ctx.close();
	}
}
