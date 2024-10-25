package com.task21sec;

public class Ticket {
	private String eventName;
	private int seatNumber;
	private double price;
	public Ticket(String eventName, int seatNumber, double price) {
		super();
		this.eventName = eventName;
		if(seatNumber<0) {
			System.err.println("Error invalid input");
			System.exit(0);
		}
		else {
		this.seatNumber = seatNumber;
		}
		if(price<0) {
			System.err.println("Error invalid input");
			System.exit(0);
		}
		else {
		this.price = price;
		}
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("The name of  concert is : "+getEventName());
		System.out.println("The seat number is :"+getSeatNumber());
		System.out.println("The price is :" +"$"+getPrice());
		
		
	}

}
