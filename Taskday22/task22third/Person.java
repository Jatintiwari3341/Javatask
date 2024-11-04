package com.task22third;

public class Person {
	private String name;
	private String address;
	private Address addr;
	public Person(String name, String address, Address addr) {
		super();
		this.name = name;
		this.address = address;
		if(addr.getStreet()<0) {
			System.err.println("Error invalid input");
			System.exit(0);
		}else
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", addr=" + addr + "]";
	}

	
	
	
	
	
	
	

}
