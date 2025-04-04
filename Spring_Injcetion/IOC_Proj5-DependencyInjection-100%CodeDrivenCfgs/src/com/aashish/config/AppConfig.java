package com.aashish.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.aashish.sbeans")
public class AppConfig 
{
 public AppConfig()
 {
	 System.out.println("AppConfig::0-param constructor");
 }
 
 @Bean(name="ldate")
 public LocalDate createDate()
 {
	 System.out.println("AppConfig.create.Date()");
	 return LocalDate.now();
 }
}
