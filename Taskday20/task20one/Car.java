package com.task20one;

public class Car extends Vehicle {
	int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	
	public void dispalyDeatils() {
//		System.out.println("the vehicle make in :"+this.make);
//		System.out.println("the model of vehicle is :"+this.model);
//		System.out.println("the year of vehicle is :"+this.year);
		super.displayDetails();
		System.out.println("the number of doors in Car :"+this.numberOfDoors);
	}

}
