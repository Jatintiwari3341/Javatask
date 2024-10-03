package com.taskopp9third;

public class Car {
  String name;
  String color;
  double price;
  
  public void getDetails() {
	  System.out.println("The name of car is "+name);
	  System.out.println("The color of car is " +color);
	  System.out.println("The price of the car is " +price);
  }
  
  public void avilable() {
	  System.out.println("The car is available in this showroom");
  }
}
