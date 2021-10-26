package fr.isika.al09.demoisika.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from code pipeline - v2";
	}

}
