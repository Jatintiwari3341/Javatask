package com.Task13first;

public class Loan {
	private double principal;
	private double interestRate;
	private int durationMonth;
	public Loan(double principal, double interestRate, int durationMonth) {
		super();
		this.principal = principal;
		this.interestRate = interestRate;
		this.durationMonth = durationMonth;
	}
	
	public double calculateMonthlyPayment() {
		double result=this.principal*this.interestRate*this.durationMonth/100;
			return result;
		}
		

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getDurationMonth() {
		return durationMonth;
	}

	public void setDurationMonth(int durationMonth) {
		this.durationMonth = durationMonth;
	}

	@Override
	public String toString() {
		return "Loan [principal=" + principal + ", interestRate=" + interestRate + ", durationMonth=" + durationMonth
				+ "]";
	}

}
