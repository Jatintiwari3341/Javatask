package com.oopstask10;

import java.util.Scanner;

public class Product {
	int productId;
	String productName;
	double productPrice;
	
	public void setProductData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product id");
		productId=sc.nextInt();
		
		
		System.out.println("Enter the product price");
		productPrice=sc.nextDouble();
		System.out.println("Enter the product name");
		productName=sc.nextLine();
		productName=sc.nextLine();
		
		sc.close();
	}
	public void getProductInfo() {
		System.out.println("The ProductId is "+productId);
		
		System.out.print("The price of product is "+productPrice);
		System.out.println("The Product name is "+productName);
	}

}
