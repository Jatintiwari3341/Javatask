package com.opptask10sec;

import java.util.Scanner;

public class Employees {
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	public void  setEmployeeData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of Employee id");
		employeeId=sc.nextInt();
		
		System.out.println("Enter  name of the Employee is ");
		employeeName=sc.nextLine();
		employeeName=sc.nextLine();
		
		System.out.println("Enter the salary of Employee is");
		employeeSalary=sc.nextDouble();
		sc.close();
		
	}
	
	public void  getEmployeeData() {
		System.out.println("The id of Employee is "+employeeId);
		System.out.println("The name of the Employee is "+employeeName);
		System.out.println("The salary of the Employee is "+employeeSalary);
	}

}
