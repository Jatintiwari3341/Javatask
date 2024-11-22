package com.task30sec;

public class FullTimeEmployee implements Employee {
private int employeeId;
private String employeeName;
private double monthlySalary;
private double benefits;


	
	public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary, double benefits) {
	super();
	if(employeeName==null) {
		System.err.println("Employee name cannot be empty");
	}
	else if(monthlySalary<=0) {
		System.err.println("Monthly salary cannot be negative");
	}
	else {
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.monthlySalary = monthlySalary;
	this.benefits = benefits;
}
	}
	

	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public double getMonthlySalary() {
		return monthlySalary;
	}



	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}



	public double getBenefits() {
		return benefits;
	}



	public void setBenefits(double benefits) {
		this.benefits = benefits;
	}



	@Override
	public double calculateSalary() {
		return monthlySalary+benefits;
	}

	@Override
	public void generatePayRoll() {
		System.out.println("PayRoll Information");
		System.out.println("Employee ID :"+getEmployeeId());
		System.out.println("Employee Name:"+getEmployeeName());
		System.out.println("Employee Monthly Salary :"+getMonthlySalary());
		System.out.println("Employee Benefits :"+getBenefits());
		System.out.println("Total Salary :"+calculateSalary());
		
		
		
	}

}
