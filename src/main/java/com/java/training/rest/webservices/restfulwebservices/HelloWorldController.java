package com.java.training.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "Hello World (Using RequestMapping)";
	}
	
	@GetMapping(path = "hello-world-get")
	public String helloWorldG() {
		return "Hello World (Using GetMapping)";
	}
	
	@GetMapping(path = "hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("This is the message from HelloWorldBean!!");
	}
}
