package com.aashish.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fkpt")
public final class Flipkart {
	@Autowired
	@Qualifier("dtdc")
	private ICourier courier;

	public Flipkart() {
	}

	// b.method
	public String Shopping(String items[], double prices[]) {
		// calculate bill amount
		double billAmount = 0;
		for (double p : prices) {
			billAmount = billAmount + p;
		}

		// generate the order id(random number as the order)
		int oid = new Random().nextInt(1000);

		// deliver the products using courier
		String msg = courier.deliver(oid);

		return Arrays.toString(items) + " item bill is " + billAmount + " and order id is " + msg;

	}
}
