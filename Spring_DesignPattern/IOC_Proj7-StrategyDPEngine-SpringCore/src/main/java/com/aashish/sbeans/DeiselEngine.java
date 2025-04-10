package com.aashish.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DeiselEngine implements IEngine 
{

	@Override
	public void startEngine()
	{
	System.out.println("Desiel Engine Start");	
	}

	@Override
	public void stopEngine() 
	{
	System.out.println("Desiel Engine Stop");	
	}

}
