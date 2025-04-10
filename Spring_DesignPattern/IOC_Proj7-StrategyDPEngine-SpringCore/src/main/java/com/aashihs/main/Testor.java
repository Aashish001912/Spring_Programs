package com.aashihs.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aashish.config.AppConfig;
import com.aashish.sbeans.Vechile;

public class Testor
{
  public static void main(String[] args) 
  {
	//create IOC Container
	 AnnotationConfigApplicationContext ctx=
			 new AnnotationConfigApplicationContext(AppConfig.class);
	 //get target spring bean class obj
	 Vechile vechile=ctx.getBean("Eng",Vechile.class);
	 
	 //Invoke Busniess method
	 vechile.journey("Hyd", "Goa");
	 //Close IOC container
	 ctx.close();
  }
}
