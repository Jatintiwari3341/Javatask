package com.task34sec;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		try {
		int a[]=new int[2];
		System.out.println("the value of the index is "+a[2]);
		 
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Index 3  is out of bounds for length 2");
			System.out.println(e.toString());
			e.printStackTrace();
		}

	}

}
