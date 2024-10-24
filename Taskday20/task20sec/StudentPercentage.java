package com.task20sec;

public class StudentPercentage {
  protected String name;
  protected int rollNumber;
public StudentPercentage(String name, int rollNumber) {
	super();
	this.name = name;
	if(rollNumber <=0) {
		System.err.println("Error Invalid Input");
		System.exit(0);
	}
	else {
	this.rollNumber = rollNumber;
	}
}
public double calculatePercentage() {
	
	return 0.0;
}


  
  public void displayDetails() {
	  System.out.println("The name of student is :"+this.name);
	  System.out.println("The roll number of student is :"+this.rollNumber);
	  
  }
    
}
