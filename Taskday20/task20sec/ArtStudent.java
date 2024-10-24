package com.task20sec;

public class ArtStudent extends StudentPercentage {
private int historyMarks;
private int geographyMarks;
private int englishMarks;
public ArtStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) {
	super(name, rollNumber);
	this.historyMarks = historyMarks;
	this.geographyMarks = geographyMarks;
	this.englishMarks = englishMarks;
}
public int getHistoryMarks() {
	return historyMarks;
}
public int getGeographyMarks() {
	return geographyMarks;
}
public int getEnglishMarks() {
	return englishMarks;
}

public double calculatePercentage() {
	double percenatge=(this.historyMarks+this.geographyMarks+this.englishMarks)/3;
			return percenatge;
}


public void displayDetails() {
	 System.out.println("The name of student is :"+this.name);
	  System.out.println("The roll number of student is :"+this.rollNumber);
	  System.out.println("The History marks :"+this.historyMarks);
	  System.out.println("The Geography marks is :"+this.geographyMarks);
	  System.out.println("The English marks is :"+this.englishMarks);
	  System.out.println("The percentage is :"+calculatePercentage());
}


}
