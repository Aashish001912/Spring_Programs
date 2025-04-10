package com.aashish.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements ICourier
{

	@Override
	public String deliver(int oid)
	{
		return "DTDC courier is ready to deliver "+oid+" order number products" ;
	}
  
}
