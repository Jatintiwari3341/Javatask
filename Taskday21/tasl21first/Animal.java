package com.tasl21first;

public class Animal {
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

	public void displayDetails() {
		System.out.println("The name of the animal is :"+getName());
	}
	
	
	

}
