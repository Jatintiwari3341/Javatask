package com.task16;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee("raj",21,"manager",50000,"good");
		Employee e2=new Employee("harsh",22,"hr",30000,"average");
		Employee e3=new Employee("ravi",33,"devloper",40000,null);
		
		e1.updateSalary();
		e2.updateSalary();
		e3.updateSalary();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		

	}

}
