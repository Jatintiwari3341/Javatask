package com.Task8third;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
       int num=sc.nextInt();
       
       boolean isEven=EvenOrOdd.IsEven(num);
       System.out.println(num+" Is Even ?:"+isEven);
       sc.close();
	}

}
