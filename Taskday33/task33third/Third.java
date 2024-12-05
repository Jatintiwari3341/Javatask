package com.task33third;

import java.util.Scanner;
import java.util.function.Function;

class FunctionApplier{
	public static int applyFunction(int value,Function<Integer,Integer>function) {
		return function.apply(value);
	}
}
public class Third {


	public static void main(String[] args) {
		Function<Integer,Integer>add=num->num+5;
		Function<Integer,Integer>mult=num->num*2;
		Function<Integer,Integer>subt=num->num-3;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("The Original value is :"+n);
		System.out.println("After adding :"+FunctionApplier.applyFunction(n, add));
		System.out.println("After Multipliaction :"+FunctionApplier.applyFunction(n, mult));
		System.out.println("After Subtraction :"+FunctionApplier.applyFunction(n, subt));
sc.close();
	}

}
