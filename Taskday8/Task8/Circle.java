package com.Task8;

public class Circle {
	
	public static String getArea(double radius) {
		if(radius<=0) {
			return ""+0;
		}
		else {
			double pi=3.14;
			double area=pi*radius*radius;
			return ""+area;
		}
	}

}
