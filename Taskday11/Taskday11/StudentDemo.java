package com.Taskday11;

public class StudentDemo {
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStudentData(101,"smith",95);
		s1.calculateGrade();
		System.out.println(s1);
		
	}

}
