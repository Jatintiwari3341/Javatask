package com.ooptsk10third;

import java.util.Scanner;

public class Hostel {
	
	int id;
	String name;
	double price;
	
	public void setHostelInformation() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		id=sc.nextInt();
		
		System.out.println("Enter the name of hostel");
		name=sc.nextLine();
		name=sc.nextLine();
		
		System.out.println("Enter the rent of room");
		price=sc.nextDouble();
		sc.close();
				
	}
	
	public void getHostelInformation() {
		System.out.println("The room is "+id);
		System.out.println("the name of Hostel is "+name);
		System.out.println("The rent of the room is "+price);
		
	}

}
