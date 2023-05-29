package com.poc.scope.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.poc.scope.stateful.Processor;

@Service
public class CustomerService {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	public String doSomethingPrototype() {
		Processor processor = (Processor) applicationContext.getBean("processorPrototype", "data", "state");
		return processor.getDataState();
    }
	
	public String doSomethingSingleton() {
        Processor processor = (Processor) applicationContext.getBean("processorSingletone");
        return processor.getDataState();
    }
	
}
