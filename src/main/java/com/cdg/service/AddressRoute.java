package com.cdg.service;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;

public class AddressRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("{{start.endpoint}}")
		.log("test")
		.to("{{end.endpoint}}");
	}

}
