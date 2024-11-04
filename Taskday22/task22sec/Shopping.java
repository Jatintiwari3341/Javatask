package com.task22sec;

public class Shopping {

	public static void main(String[] args) {
		Order o1=new Order("sss","perfume");
	//	System.out.println(o1);
		Customer c1=new Customer("smith","smith@gmail.com",o1);
		System.out.println(c1);
	}
}
