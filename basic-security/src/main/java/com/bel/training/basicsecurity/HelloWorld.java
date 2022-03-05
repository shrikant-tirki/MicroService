package com.bel.training.basicsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	//http://localhost:8083/hello?name=User
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam("name") String name) {
		return "Hello "+name;
	}
}
