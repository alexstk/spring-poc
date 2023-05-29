package com.poc.scope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.scope.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/processor/prototype")
	public String getProcesorPrototype() {
		return customerService.doSomethingPrototype();
	}
	
	@GetMapping("/processor/singleton")
	public String getProcesorSingleton() {
		return customerService.doSomethingSingleton();
	}
	
}
