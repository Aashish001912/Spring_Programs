package com.aashish.Testor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aashish.config.AppConfig;
import com.aashish.sbeans.Flipkart;

public class StrategyDPTestor
{
  public static void main(String[] args) 
  {
	//create IOC Container
	  AnnotationConfigApplicationContext ctx=
			  new AnnotationConfigApplicationContext(AppConfig.class);
	  
	  //get target Spring bean class obj ref
	  Flipkart fkpt=ctx.getBean("fkpt",Flipkart.class);
	  
	  // invoke b.method
	  String resultMsg=fkpt.Shopping(new String[] {"Shirt","Trouser"},
			  new double[] {299,9000});
	  System.out.println(resultMsg);
	  
	  ctx.close();
  }
}
