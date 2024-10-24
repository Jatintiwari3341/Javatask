package com.task20third;

public class Main {

	public static void main(String[] args) {
		//Circle c1=new Circle(4);
		//double area = c1.getArea();
		//System.out.println("The area of circle is :"+area);
		Cylinder c2=new Cylinder(4,5);
		double area = c2.getArea();
		System.out.println("The area of circle is :"+area);
		double volume = c2.getVolume();
		System.out.println("The volume of cylinder is :"+volume);

	}

}
