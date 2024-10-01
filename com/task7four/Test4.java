package com.task7four;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first numbers");
		int a=sc.nextInt();
		System.out.println("Enter the second numbers");
		int b=sc.nextInt();
		System.out.println("Enter the third numbers");
		int c=sc.nextInt();
		int result=RoundedSum.sumOfRoundedValues(a, b, c);
   System.out.println("the result is"+result);
   sc.close();
	}

}
