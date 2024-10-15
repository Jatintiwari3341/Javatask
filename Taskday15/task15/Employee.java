package com.task15;

import java.util.Scanner;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	
	

	public static Employee getEmployeeObject() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Employee id");
		int id=sc.nextInt();
		
		if(id<0) {
			System.err.print("Employee id must be positive");
			System.exit(0);
		}
		
		System.out.println("Enter the name of Employee");
		String name=sc.nextLine();
		name=sc.nextLine();
		
		System.out.println("Enter the salary of Employee");
		double salary=sc.nextDouble();
		
		return new Employee(id,name,salary);
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

}
