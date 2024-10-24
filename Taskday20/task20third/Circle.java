package com.task20third;

public class Circle {
	
	protected double radius;
	{
		this.radius=0.0;
	}

	public Circle(double radius) {
		super();
		if(radius<=0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		else {
			
		
		this.radius = radius;
		}
	}
	
	public double getArea() {
		if(radius<=0) {
			return -1;
		}
		else {
		final double PI=3.14;
		double area=PI*this.radius*this.radius;
		return area;
	}
	
	}
}
