package com.Task8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius");
	 double radius=sc.nextDouble();
	 String area=Circle.getArea(radius);
	 double areaOfCircle=Double.parseDouble(area);
	 DecimalFormat df=new DecimalFormat("00.00");
	 System.out.println("Area of Circle is"+df.format(areaOfCircle));
	 sc.close();
	
	
	
}
}
