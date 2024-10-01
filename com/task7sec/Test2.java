package com.task7sec;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int num=sc.nextInt();
		int diff=TwoDigitDifferene.getDiffOfDigits(num);
		System.out.println("the difference is"+diff);
sc.close();
	}

}
