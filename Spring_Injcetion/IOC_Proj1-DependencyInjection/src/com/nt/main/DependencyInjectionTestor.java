package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTestor
{
	public static void main(String[] args) 
	{
	 //create IOC container
	  FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	  
	//get target Spring bean class obj ref
	  Object obj=ctx.getBean("wmg");
	
	//Type casting 
	  WishMessageGenerator generator=(WishMessageGenerator)obj;
	
	//invoke the Business Method
	  String msg=generator.showWishMessageGenerator("Aashish");
	  System.out.println("Result:"+msg);
	  
	//Close the IOC Container
	  ctx.close();
			 
	}

}
