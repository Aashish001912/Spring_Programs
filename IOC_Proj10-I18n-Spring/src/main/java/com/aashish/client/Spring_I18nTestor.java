package com.aashish.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aashish.config.AppConfig;

public class Spring_I18nTestor 
{
	public static void main(String[] args) 
	{
	 //create IOC container
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter language Code:");
     String lang=sc.next();
     System.out.println("Enter Countery Code:");
     String country=sc.next();
     
     //Prepare locale obj having language code+country code
     Locale locale=new Locale(lang,country);
     //Locale locale1=Locale.of(lang,country);
     
     //read the message from the locale specific properties file using the ctx.getMessage(-) method
     String msg1=ctx.getMessage("welcome.msg",new Object[] {"raja"}, locale);
     String msg2=ctx.getMessage("goodbye.msg",new Object[] {}, locale);
     String msg3=ctx.getMessage("application.title",new Object[] {}, locale);
     String msg4=ctx.getMessage("wish.message",new Object[] {}, locale);
     
     System.out.println(msg1+"..."+msg2+"..."+msg3+"..."+msg4);
     ctx.close();
	}
}
