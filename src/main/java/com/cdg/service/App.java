package com.cdg.service;

import org.apache.camel.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/Resources/camel-context.xml");
    	ctx.getBean("test");
    	
    	@SuppressWarnings("deprecation")
		Main main = new Main();
    	main.addRouteBuilder(new AddressRoute());
    	try {
			main.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
