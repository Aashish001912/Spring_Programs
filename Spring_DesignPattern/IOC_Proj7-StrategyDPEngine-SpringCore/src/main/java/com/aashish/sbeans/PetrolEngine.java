package com.aashish.sbeans;

import org.springframework.stereotype.Component;

@Component()
public class PetrolEngine implements IEngine 
{

	@Override
	public void startEngine()
	{
	System.out.println("Petrol Engine Start");	
	}

	@Override
	public void stopEngine() 
	{
	System.out.println("Petrol Engine Stop");	
	}

}
