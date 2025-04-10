package com.aashish.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements ICourier
{

	@Override
	public String deliver(int oid)
	{
		return "BlueDart courier is ready to deliver "+oid+" order number products" ;
	}

}
