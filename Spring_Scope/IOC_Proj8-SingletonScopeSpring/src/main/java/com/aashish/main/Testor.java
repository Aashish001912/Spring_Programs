package com.aashish.main;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aashish.config.AppConfig;
import com.aashish.sbeans.WishMessageGenerator;

public class Testor
{
	public static void main(String[] args) 
	{
	AnnotationConfigApplicationContext ctx=
			new AnnotationConfigApplicationContext(AppConfig.class);
	
	//get Target Spring bean class obj
	WishMessageGenerator genertaor=ctx.getBean("wmg",WishMessageGenerator.class);
	WishMessageGenerator genertaor1=ctx.getBean("wmg",WishMessageGenerator.class);
	WishMessageGenerator genertaor2=ctx.getBean("wmg",WishMessageGenerator.class);
	
	System.out.println(genertaor.hashCode()+" "+genertaor1.hashCode()+" "+genertaor2.hashCode());
	
	System.out.println("========================");
	
	LocalDateTime ldt3=ctx.getBean("dt1",LocalDateTime.class);
	LocalDateTime ldt4=ctx.getBean("dt1",LocalDateTime.class);
	System.out.println(ldt3.hashCode()+" "+ldt4.hashCode());
	
	System.out.println("========================");
	
	LocalDateTime ldt5=ctx.getBean("dt1",LocalDateTime.class);
	LocalDateTime ldt6=ctx.getBean("dt1",LocalDateTime.class);
	System.out.println(ldt4.hashCode()+" "+ldt6.hashCode());
	}

}
