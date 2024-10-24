package com.task20sec;

public class Main {

	public static void main(String[] args) {
		System.out.println("Science Student Details :");
		ScienceStudent s1=new ScienceStudent("raj",101,85,90,80);
		s1.calculatePercentage();
		s1.displayDetails();
		ArtStudent a1=new ArtStudent("ravi",102,75,80,85);
		System.out.println("\nArts Student Details :");
		a1.calculatePercentage();
		a1.displayDetails();

	}

}
