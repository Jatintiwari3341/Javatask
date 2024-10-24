package com.task20one;

public class Vehicle {
	String make;
	String model;
	int year;
	public Vehicle(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		if(year<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		else {
		this.year = year;
		}
	}
	
	public void displayDetails() {
		System.out.println("the vehicle make in "+this.make);
		System.out.println("the model of vehicle is "+this.model);
		System.out.println("the year of vehicle is "+this.year);
	}

}
