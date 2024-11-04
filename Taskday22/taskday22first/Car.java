package com.taskday22first;

public class Car {
	private String make;
	private String model;
	private Engine engine;
	public Car(String make, String model) {
		super();
		if(make==null||model==null) {
			System.err.println("It can not be null");
			System.exit(0);
		}
		this.make = make;
		this.model = model;
		this.engine = new Engine("battery");
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", engine=" + engine + "]";
	}
	
	
	
	

}
