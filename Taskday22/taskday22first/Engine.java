package com.taskday22first;

public class Engine {
	private String model;

	public Engine(String model) {
		super();
		if(model==null) {
			System.err.println("This not contain any numeric number");
			System.exit(0);
		}
		else {
		this.model = model;
		}
		}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Engine [model=" + model + "]";
	}
	
	

}
