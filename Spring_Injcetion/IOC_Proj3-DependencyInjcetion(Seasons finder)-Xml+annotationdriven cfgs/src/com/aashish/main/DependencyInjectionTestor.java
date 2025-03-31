package com.aashish.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.aashish.sbeans.SeasonsFinder;

public class DependencyInjectionTestor
{
	public static void main(String[] args) 
	{
	 //Create IOC Container
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/aashish/cfgs/applicationContext.xml");
	 // get target Spring bean class Obj ref
		Object obj=ctx.getBean("sf");
	    SeasonsFinder sf=(SeasonsFinder)obj;
	 //invoke business method
	    try
	    {
	    	String msg = sf.showSeasonName();
	    	System.out.println("Season Name is:"+msg);
	    }
	    catch (Exception e)
	    {
		e.printStackTrace();
	    }
	 //close IOC container
	    ctx.close();
	
	}

}
