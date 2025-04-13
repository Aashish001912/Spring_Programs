package com.aashish.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aashish.config.AppConfig;
import com.aashish.sbeans.PersonalInfo;

public class PropertiesFileTest 
{
	public static void main(String[] args) 
	{
	AnnotationConfigApplicationContext ctx=
			new AnnotationConfigApplicationContext(AppConfig.class);
	PersonalInfo info=ctx.getBean("pInfo",PersonalInfo.class);
	System.out.println(info);
	ctx.close();
	
	}

}
