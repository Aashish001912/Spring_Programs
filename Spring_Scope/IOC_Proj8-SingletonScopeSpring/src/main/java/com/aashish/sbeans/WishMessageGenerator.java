package com.aashish.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("singleton")
public class WishMessageGenerator
{
  @Autowired
  @Qualifier("dt")
  private LocalDateTime ldt;//HAS-A property
  public WishMessageGenerator()
  {
	  
  }
}
