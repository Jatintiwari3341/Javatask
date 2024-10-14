package com.task13third;

public class Tester {

	public static void main(String[] args) {
		Employee e1 =new Employee(101,"Ashu",30000);
		System.out.println(e1);
		int  empid=e1.getEmployeeNumber();
		double empsal=e1.getEmployeeSalary();
		String empname=e1.getEmployeeName();
		
		if(empid<0) {
			System.err.println("id must be always postive integer");
		}
		else if(empsal<0) {
			System.err.println("Salary cant not be negative");
		}
		else if(empname==null) {
			System.err.println("Name must be intialize with default value");
		}
		
		else if(empsal>=60000) {
			System.out.println(empname+ " is a Developer");
		}
		else if(empsal>=40000 && empsal<60000) {
			System.out.println(empname+ " is a Designer");
		}
		else {
			System.out.println(empname+ " is a Tester");
		}

	}

}
