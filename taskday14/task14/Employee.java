package com.task14;

public class Employee {
	private String firstName;
    private String lastName;
    private int employeeId;
    private double noOfProject;
    private double salary;
	
    
    public Employee(String firstName, String lastName, int employeeId, double noOfProject, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.noOfProject = noOfProject;
		this.salary = salary;
	}
    
    


	public String getFirstName() {
		return firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public int getEmployeeId() {
		return employeeId;
	}




	public double getNoOfProject() {
		return noOfProject;
	}




	public double getSalary() {
		return salary;
	}




	public void calculateSalary() {
		
		if(this.noOfProject<0) {
			   System.out.println("Number of projects cant be negative");
		   }
		     
		else if(this.noOfProject>5 && this.noOfProject<10) {
    		this.salary=this.salary+5000;
    		System.out.println("the salary is "+this.salary);
    	}
    	else if(this.noOfProject>10 && this.noOfProject<20) {
    		this.salary=this.salary+10000;
    		System.out.println("the salary is "+this.salary);
    	}
    		
    	
    	else {
    		this.salary=this.salary+20000;
    		System.out.println("the salary is "+this.salary);
    	
    	}
    }


	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", noOfProject=" + noOfProject + ", salary=" + salary + "]";
	}
	

}
