package com.task34first;

import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			
			
			System.out.println("Enter the first number");
			int num1=sc.nextInt();
			System.out.println("Enter the second number");
			int num2=sc.nextInt();
			System.out.println("A ="+num1);
			System.out.println("B ="+num2);
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
			System.err.print(e.getMessage());
			System.out.println(e.toString());
			sc.close();
		
			
		}

	}

}
