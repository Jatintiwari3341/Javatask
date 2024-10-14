package com.task13third;

public class Employee {
  int employeeNumber;
  String employeeName;
  double employeeSalary;
public Employee(int employeeNumber, String employeeName, double employeeSalary) {
	super();
	this.employeeNumber = employeeNumber;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
}



public int getEmployeeNumber() {
	return employeeNumber;
}



public void setEmployeeNumber(int employeeNumber) {
	this.employeeNumber = employeeNumber;
}



public String getEmployeeName() {
	return employeeName;
}



public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}



public double getEmployeeSalary() {
	return employeeSalary;
}



public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}



@Override
public String toString() {
	return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
			+ employeeSalary + "]";
}
  
  
}
