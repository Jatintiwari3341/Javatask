package com.task30first;

public class MyCalculator implements AdvanceArithmetic {

	@Override
	public int divisorSum(int n) {
		
		if(n<=0) {
			System.err.println("Number must be positive");
		}
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum+=i;
			}
			
			
		}
		return sum;
		
	
	}	
		
}
		
	
	
