package com.task21sec;

public class StudentTicket extends Ticket {
	
private boolean studentDiscount;

public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) {
	super(eventName, seatNumber, price);
	this.studentDiscount = studentDiscount;
}

public boolean isStudentDiscount() {
	return studentDiscount;
}

public void setStudentDiscount(boolean studentDiscount) {
	this.studentDiscount = studentDiscount;
}

@Override
public void displayDetails() {
	super.displayDetails();
	System.out.println("The Student Discount is :"+isStudentDiscount());

}
}