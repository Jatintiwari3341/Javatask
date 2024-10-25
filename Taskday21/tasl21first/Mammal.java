package com.tasl21first;

public class Mammal extends Animal {
	
	private boolean hasFur;

	public Mammal(String name, boolean hasFur) {
		super(name);
		this.hasFur = hasFur;
	}


	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	
	
	

	@Override
		public void displayDetails() {
		super.displayDetails();
		System.out.println("The information of hasFur :"+isHasFur());
	}

		
	

}
