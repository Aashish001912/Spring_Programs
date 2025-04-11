package com.aashish.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.aashish.sbeans")
public class AppConfig
{
  public AppConfig()
  {
	  
  }
  
  @Bean(name="dt")
  @Scope("singleton")
  public LocalDateTime createLDT()
  {
	  return LocalDateTime.now();
  }
  
  @Bean(name="dt1")
  @Scope("singleton")
  public LocalDateTime createLDT1()
  {
	  return LocalDateTime.now();
  }
  
}
