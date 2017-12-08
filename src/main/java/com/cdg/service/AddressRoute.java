package com.cdg.service;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.properties.PropertiesComponent;

public class AddressRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		PropertiesComponent pc = getContext().getComponent("properties", PropertiesComponent.class);
		pc.setLocation("classpath:ftp.properties");
		
		from("file:C:\\camelTest\\origin?noop=true").log(LoggingLevel.DEBUG, "log:").to("file:C:\\camelTest\\destination");
	}

}
