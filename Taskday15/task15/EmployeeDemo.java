package com.task15;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of object");
		int noOfobjects=sc.nextInt();
		
		for(int i=1;i<=noOfobjects;i++) {
			Employee employeeobject=Employee.getEmployeeObject();
			System.out.println(employeeobject);
		
		}
		sc.close();
	}
	
}
