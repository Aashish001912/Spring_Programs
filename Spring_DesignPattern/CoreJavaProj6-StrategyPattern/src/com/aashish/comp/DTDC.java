package com.aashish.comp;

//Dependent class
public class DTDC implements Courier
{

	@Override
	public String deliver(int oid)
	{
		return oid+" Order items are kept for delivery by DTDC";
	}

}
