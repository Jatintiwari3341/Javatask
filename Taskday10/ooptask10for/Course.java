package com.ooptask10for;

import java.util.Scanner;

public class Course {
int courseId;
String courseName;
double coursePrice;

public void setCourseDetails() {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the courseId");
	courseId=sc.nextInt();
	
	System.out.println("Enter the courseName");
	courseName=sc.nextLine();
	courseName=sc.nextLine();
	
	System.out.println("Enter the price of course ");
	coursePrice=sc.nextDouble();
	sc.close();
}

public void getCourseDetails() {
	System.out.println("The id of the course is "+courseId);
	System.out.println("The name of course is "+courseName);
	System.out.println("The price of course is "+coursePrice);
}
}
