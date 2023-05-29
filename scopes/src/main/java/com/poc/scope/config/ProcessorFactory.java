package com.poc.scope.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.poc.scope.stateful.Processor;

@Configuration
public class ProcessorFactory {

	@Bean(name = "processorPrototype")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	Processor createProcessorPrototype(String data, String state) {
		return new Processor(data, state);
	}
	
	@Bean(name = "processorSingletone")
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	Processor createProcessorSingleton() {
		return new Processor("data2", "state2");
	}
}
