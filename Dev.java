package com.moloko.myDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev 
{
	@Autowired //Field Injection
	@Qualifier("laptop") //replaces primary 
	private Computer comp;
	
	
	public void build()
	{
		comp.compile();
		System.out.println("Working on an awesome project");
	}
}
