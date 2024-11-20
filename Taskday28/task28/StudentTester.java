package com.task28;

public class StudentTester {

	public static void main(String[] args) {
		Student s1=new ScienceStudent("smith","10th",70,80,90);
		s1.getPercentage();
		System.out.println();
		
		Student s2=new HistoryStudent("scott","12th",70,80);
		s2.getPercentage();
		
	System.out.println("The number of students is "+Student.getTotalNoOfStudents());
		
		

	}

}
