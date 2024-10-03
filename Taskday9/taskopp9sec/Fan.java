package com.taskopp9sec;

public class Fan {
	String name;
	String coil;
	int wings;
	
	public void switchOn() {
		System.out.println("The name of Fan is"+name);
		System.out.println("The name of coil is"+coil);
		System.out.println("The number of wings is"+wings);
		
	}
	public void switchOff() {
		System.out.println("please switch of the fan");
	}

}
