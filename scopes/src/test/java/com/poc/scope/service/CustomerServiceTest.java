package com.poc.scope.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.ApplicationContext;

import com.poc.scope.stateful.Processor;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {
	
	@InjectMocks
	CustomerService customerService;
	
	@Mock
	ApplicationContext applicationContext;
	
	@Test
	void whenDoSomethingPrototype_thenReturnDataState() {
		when(applicationContext.getBean(anyString(), anyString(), anyString()))
		.thenReturn(new Processor("data", "state"));
		
		String string = customerService.doSomethingPrototype();
		
		assertTrue(string.contains("data_state"));
	}

}
