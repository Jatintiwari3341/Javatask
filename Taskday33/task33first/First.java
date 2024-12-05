package com.task33first;

import java.util.Scanner;
import java.util.function.Predicate;

 class CalculateLogic{
	 public static boolean testPredicate(int num,Predicate<Integer>predicate) {
		 return predicate.test(num);
	 }
	
 }

public class First {

	public static void main(String[] args) {
		Predicate<Integer> isEven=num ->num%2==0;
		Predicate<Integer> isGreater=num->num>10;
		Predicate<Integer> isPrime=num->{
			int count=0;
			if(num<=1)return false;
			for(int i=1;i<=num;i++){
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				return true;
			}
			
			return false;	
				
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		System.out.println("the number is Even "+CalculateLogic.testPredicate(n,isEven));
		System.out.println("the number is Prime "+CalculateLogic.testPredicate(n,isPrime));
		System.out.println("the number is GreaterThanTen "+CalculateLogic.testPredicate(n,isGreater));
//		boolean result=isEven.test(n);
//		System.out.println("Is "+n+" even ??"+result);
//		
//		 result=isPrime.test(n);
//		System.out.println("Is "+n+" prime ??"+result);
//		
//		 result=isGreater.test(n);
//		System.out.println("Is "+n+" GreaterThanTen ??"+result);
//		
		
	
	}

}
