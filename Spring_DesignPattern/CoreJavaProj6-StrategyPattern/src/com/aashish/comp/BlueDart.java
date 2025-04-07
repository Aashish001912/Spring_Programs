package com.aashish.comp;

//Dependent class
public class BlueDart implements Courier
{

	@Override
	public String deliver(int oid) 
	{
		return oid+" order item are kept for dilivery by BlueDart";
	}

}
