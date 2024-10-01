package com.Task7;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sumDigit = TwoDigitSum.getSumDigit(num);
		System.out.println("the sum of digits is"+sumDigit);
		sc.close();

	}

}
