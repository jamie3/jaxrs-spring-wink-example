package jaxrs.spring.wink.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

	//@Autowired
	HelloService helloService;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return helloService.sayHello();
	}
}
