package com.task22third;

public class Address {
	private int Street;
	private String city;
	public Address(int street, String city) {
		super();
//		if(Street<0) {
//			System.err.println("Error invalid input");
//			System.exit(0);
//		}
//		else {
		this.Street = street;
//		}
		this.city = city;
		
	}
	public int getStreet() {
		return Street;
	}
	public void setStreet(int street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + "]";
	}
	
	

}
