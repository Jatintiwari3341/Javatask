package com.task17;

public class Rectangle {
private double width;
private double height;
{
	width=0;
	height=0;
}
public Rectangle(double width, double height) {
	super();
	if(width<0 || height<0) {
		System.err.println("Width and Height must be non negative");
		System.exit(0);
	}
	else {
	this.width = width;
	this.height = height;
	}
}

public double getArea() {
	double Area=this.width*this.height;
	return Area;
	
}
public double getPerimeter() {
	double Perimeter=2*(this.width+this.height);
	return Perimeter;
}
}
