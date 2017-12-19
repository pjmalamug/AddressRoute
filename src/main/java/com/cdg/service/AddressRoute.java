package com.cdg.service;

import org.apache.camel.builder.RouteBuilder;

public class AddressRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("{{start.endpoint}}")
		.log("${body}")
		.to("{{end.endpoint}}");
	}

}
