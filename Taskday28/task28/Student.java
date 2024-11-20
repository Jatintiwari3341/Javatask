package com.task28;

public abstract class Student {
	
	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents=0;
	
	public abstract int getPercentage();

	

	public Student() {
		super();
	}

	public Student(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNoOfStudents++;
	}
	public static int getTotalNoOfStudents() {
	//	System.out.println("the number of student is :"+getTotalNoOfStudents());
		return totalNoOfStudents;
	}

	public static void setTotalNoOfStudents(int totalNoOfStudents) {
		Student.totalNoOfStudents = totalNoOfStudents;
	}
	
	

}
