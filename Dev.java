package com.moloko.myDependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Dev 
{
	
	public void build()
	{
		System.out.println("Working on an awesome project");
	}
}
