package com.cdg.service;

import org.apache.camel.builder.RouteBuilder;

public class AddressRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:C:\\camelTest\\origin?noop=true").to("file:C:\\camelTest\\destination");
	}

}
