package com.task20one;

public class Test {

	public static void main(String[] args) {
		System.out.println("Car details are:");
		Car c1=new Car("Kia","Sonet",2023,4);
		c1.dispalyDeatils();
		
		
		Bike b1=new Bike("Bajaj","Pulsar",2016,"sports");
		System.out.println("\nBike details are:");
		b1.displayDetails();
	}

}
