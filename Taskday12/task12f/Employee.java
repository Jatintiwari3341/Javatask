package com.task12f;

public class Employee {
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	public Employee(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProject = noOfProject;
	}
	
	public void calculateSalary() {
		if(this.noOfProject<=0) {
			System.err.println("Number of project is annaot be negative");
		}
		else if(this.noOfProject>5 && this.noOfProject<10) {
			this.salary=salary+5000;
		}
		else if(this.noOfProject>10 && this.noOfProject<20) {
			this.salary=salary+10000;
		}
		else {
			this.salary=salary+20000;
		}
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", noOfProject=" + noOfProject + "]";
	}
	
	
	

}
