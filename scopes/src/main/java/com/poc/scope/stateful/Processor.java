package com.poc.scope.stateful;


public class Processor {
	
	private String data;
	private String state;
	private double randomNumber;

	public Processor(String data, String state) {
		this.data = data;
		this.state = state;
		randomNumber = Math.random();
	}
	
	public String getDataState() {
		return data + "_" + state + "_" + randomNumber;
	}
	
}
