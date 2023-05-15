package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello World From GithubAction";
	}
	
	@GetMapping("/workout")
	public String getWorkout() {
		return "Completed 5k";
	}
}
