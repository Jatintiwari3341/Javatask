package com.task20third;

public class Cylinder extends Circle {
protected double height;
{
	this.height=0.0;
}
public Cylinder(double radius, double height) {
	super(radius);
	this.height = height;
}
public double getVolume() {
	if(height<0) {
		return -1;
	}
	else {
		
	
	final double PI=3.14; 
	double volume=PI*this.radius*this.radius*this.height;
	return volume;
}

}





}
