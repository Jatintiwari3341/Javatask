package com.task21sec;

public class Main {

	public static void main(String[] args) {
		Ticket t1=new Ticket("Concert",-34,450);
		System.out.println("The regular tickets are :");
		t1.displayDetails();
		VIPTicket v1=new VIPTicket("VIP Concert",23,670,"Backstage Acess");
		System.out.println("\nThe VIP tickets are :");
		v1.displayDetails();
		StudentTicket s1=new StudentTicket("Student Event",87,500,true);
		System.out.println("\nThe Student tickets are :");
		s1.displayDetails();
		

	}

}
