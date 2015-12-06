package com.ciber.training;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/sample")
public class First {
	@Produces("text/plain")
	@GET
	public String getMessage(){
		return "Welcome to restful service";
	}
}
