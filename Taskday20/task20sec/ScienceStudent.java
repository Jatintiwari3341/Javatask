package com.task20sec;

public class ScienceStudent extends StudentPercentage {
	
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	public ScienceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(name, rollNumber);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}
	public int getPhysicsMarks() {
		return physicsMarks;
	}
	public int getChemistryMarks() {
		return chemistryMarks;
	}
	public int getMathMarks() {
		return mathMarks;
	}
	public double calculatePercentage() {
		double percentage=(this.physicsMarks+this.chemistryMarks+this.mathMarks)/3;
	
	return percentage;
	}
	public void displayDetails() {
		 System.out.println("The name of student is :"+this.name);
		  System.out.println("The roll number of student is :"+this.rollNumber);
		  System.out.println("The Physics marks :"+this.physicsMarks);
		  System.out.println("The Chemistry marks is :"+this.chemistryMarks);
		  System.out.println("The Math marks is :"+this.mathMarks);
		  System.out.println("The Percentage is :"+calculatePercentage());
	}
	
	

}
