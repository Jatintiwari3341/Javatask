package com.task30first;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyCalculator c1=new MyCalculator();
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num==0) {
			System.err.println("input must be a positive integer");
		}
		else if(num<0) {
			System.err.println("Invalid input.please enter a valid positive integer ");
		}
		else {
		int result =c1.divisorSum(num);
		System.out.println("Sum of divisor is: " +result);
		}
		sc.close();
	}
	

}
