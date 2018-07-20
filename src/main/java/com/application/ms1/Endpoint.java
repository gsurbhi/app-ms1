package com.application.ms1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("ms1")
public class Endpoint {
	
	@Produces({MediaType.APPLICATION_JSON})
	@GET
	@Path("/firstnumber")
	public int sum() {
		
		return 5;
	}
	
}
