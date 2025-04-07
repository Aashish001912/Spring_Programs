package com.aashish.comp;

import java.util.Arrays;
import java.util.Random;

//Target Class
public final class Flipkart {
	private Courier courier;

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	// business method
	public String shopping(String items[],double prices[])
	{
		//calculate bill amount
		double billAmount=0;
		for(double p:prices)
		{
			billAmount=billAmount+p;
		}
		
		//generate the order id(random number as the order)
		int oid=new Random().nextInt(1000);
		
		//deliver the products using courier
		String msg=courier.deliver(oid);
		
		return Arrays.toString(items)+" item bill is "+billAmount+" and order id is "+msg;
		
		
	}

}
