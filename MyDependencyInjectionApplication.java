package com.moloko.myDependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyDependencyInjectionApplication {

	public static void main(String[] args) 
	{
		//Dependency Injection
		ApplicationContext context = SpringApplication.run(MyDependencyInjectionApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
		
	}

}
