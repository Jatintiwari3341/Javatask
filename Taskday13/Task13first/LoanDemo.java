package com.Task13first;

public class LoanDemo {

	public static void main(String[] args) {
		Loan l1=new Loan(1000,2,12);
		double result=l1.calculateMonthlyPayment();
		
		double principals=l1.getPrincipal();
	double rates=l1.getInterestRate();
	int month=l1.getDurationMonth();
	
	if(principals<=0.0) {
		System.err.println("Error 1");
		System.exit(0);
	}
	if(rates<=0.0) {
		System.err.println("Error 2");
	}
	if(month<=0) {
		System.err.println("Error 3");
		System.exit(0);
	}
	else {
		System.out.println("Principals "+principals);
		System.out.println("rates "+rates);
		System.out.println("Months "+month);
		System.out.println("total amount "+result);
		
	}
	
	}

}
