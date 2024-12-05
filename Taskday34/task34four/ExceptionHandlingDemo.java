package com.task34four;

public class ExceptionHandlingDemo {
public static void handleException(String s) {
	try{
		int length = s.length();
		System.out.println("Length of the input string :"+length);
		int len=Integer.parseInt(s);
		System.out.println("Converted number :"+len);
		
	}
	catch(NullPointerException|NumberFormatException e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		handleException(null);

	}

}
