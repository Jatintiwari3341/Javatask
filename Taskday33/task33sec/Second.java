package com.task33sec;



import java.util.Scanner;
import java.util.function.Consumer;


class ValueModifier{
	public static void modifyValue(int num,Consumer<Integer> consumer) {
		consumer.accept(num);
	}
}


public class Second{
	public static void main(String[] args) {
		Consumer<Integer>dbval=num->{
			int result=num+num;
		 System.out.println(num +" After modifying the double value is "+result);
			
		};
			Consumer<Integer>Incval=num->{
				int result=num+3;
				System.out.println(num +" After modifying the incremented value is "+result);
			};
			Consumer<Integer>Squval=num->{
				int result=num*num;
				System.out.println(num +" After modifying the square of number is "+result);
			};
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			ValueModifier.modifyValue(n, dbval);
			ValueModifier.modifyValue(n, Incval);
			ValueModifier.modifyValue(n, Squval);
			
			
			sc.close();
		
				
		

	}

}
