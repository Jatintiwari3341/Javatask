package com.task20one;

public class Bike extends Vehicle {
	String type;

	public Bike(String make, String model, int year, String type) {
		super(make, model, year);
		this.type = type;
	}
	@Override
	public void displayDetails() {
//		System.out.println("the vehicle make in :"+this.make);
//		System.out.println("the model of vehicle is :"+this.model);
//		System.out.println("the year of vehicle is :"+this.year);
		super.displayDetails();
		System.out.println("the type of vehicle is :"+this.type);
	}

}
