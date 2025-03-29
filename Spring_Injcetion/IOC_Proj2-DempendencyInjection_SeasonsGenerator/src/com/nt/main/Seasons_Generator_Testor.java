package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Seasons_Generator;

public class Seasons_Generator_Testor 
{
	public static void main(String[] args) 
	{
	// Create IOC container
	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	
	//get target Spring bean class obj ref
	Object obj=ctx.getBean("SeasonFinder");
	
	//Type casting
	Seasons_Generator generator=(Seasons_Generator)obj;
	
	//invoke the business method
	String msg=generator.showCurrentSeasons();
	System.out.println("Current Seasons is:"+msg);
	
	//IOC container
	ctx.close();
	
	}

}
