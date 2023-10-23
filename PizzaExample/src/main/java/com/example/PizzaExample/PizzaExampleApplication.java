package com.example.PizzaExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class PizzaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaExampleApplication.class, args);
		System.out.println("Test");
	}

	@GetMapping("/")
	public String index(){
		return "Index";
	}


	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
		return "Hello "+ name;
	}

}
