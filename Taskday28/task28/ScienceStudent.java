package com.task28;

public class ScienceStudent extends Student {
	
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	
	
	public ScienceStudent(String studentName, String studentClass, int physicsMarks, int chemistryMarks,
			int mathsMarks) {
		super(studentName, studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}


	public int getPhysicsMarks() {
		return physicsMarks;
	}


	public int getChemistryMarks() {
		return chemistryMarks;
	}


	public int getMathsMarks() {
		return mathsMarks;
	}




	@Override
	public int getPercentage() {
		System.out.println("The name of student is :"+this.studentName);
		System.out.println("The name of the class is :"+this.studentClass);
		System.out.println("The marks of physics is :"+getPhysicsMarks());
		System.out.println("The marks of chemistry is :"+getChemistryMarks());
		System.out.println("The marks of maths is :"+getMathsMarks());
		int percentageOfScience=(getPhysicsMarks()+getChemistryMarks()+getMathsMarks())/3;
		System.out.println("total percentage is :"+percentageOfScience+"%");
		return percentageOfScience;
	}


	


	
}
