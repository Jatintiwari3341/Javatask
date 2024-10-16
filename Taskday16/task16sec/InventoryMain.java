package com.task16sec;

public class InventoryMain {

	public static void main(String[] args) {
		InventoryItem i1=new InventoryItem(null,10,15);
		double totalValue=i1.calculateTotalValue();
		System.out.println("the total value is "+totalValue);
		System.out.println(i1);

	}

}
