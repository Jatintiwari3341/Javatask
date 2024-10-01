package com.task7third;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num=sc.nextInt();
		int nextMultipleOfHundred = NextMultipleofHundred.getNextMultipleOfHundred(num);
    System.out.println("next multiple is"+nextMultipleOfHundred);
    sc.close();
	}

}
