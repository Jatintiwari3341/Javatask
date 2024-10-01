package com.task7four;

public class RoundedSum {
	public static int sumOfRoundedValues(int a,int b,int c) {
		
		a=((a/10)+((a%10)/5))*10;
		b=((b/10)+((b%10)/5))*10;
		c=((c/10)+((c%10)/5))*10;
		return a+b+c;
	}

}
