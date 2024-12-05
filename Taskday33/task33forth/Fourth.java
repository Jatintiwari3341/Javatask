package com.task33forth;

import java.util.Random;
import java.util.function.Supplier;

class  NumberGenerator{
	public static int generateRandomNumber(int min,int max) {
		Random r = new Random();
		Supplier<Integer> s =()->{
			
			return r.nextInt(min, max);
		};
				
		return s.get();		
		
	}
	
}
public class Fourth {
	

	public static void main(String[] args) {
		
	
		System.out.println(NumberGenerator.generateRandomNumber(5, 10));

	}

}
