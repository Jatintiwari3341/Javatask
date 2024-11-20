package com.task28;

public class HistoryStudent extends Student {
	
	private int  historyMarks;
	private int civicsMarks;
	
	public HistoryStudent(String studentName, String studentClass, int historyMarks, int civicsMarks) {
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	public int getHistoryMarks() {
		return historyMarks;
	}

	public int getCivicsMarks() {
		return civicsMarks;
	}




	@Override
	public int getPercentage() {
		System.out.println("The name of student is :"+this.studentName);
		System.out.println("The name of the class is :"+this.studentClass);
		System.out.println("The marks of history is :"+getHistoryMarks());
		System.out.println("The marks of civics is :"+getCivicsMarks());
		int percentageOfHistory=(getHistoryMarks()+getCivicsMarks())/2;
		System.out.println("The percentage of history students :"+percentageOfHistory+"%");
		
		return percentageOfHistory;
	}

}
