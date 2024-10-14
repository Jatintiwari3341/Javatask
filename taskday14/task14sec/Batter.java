package com.task14sec;

public class Batter {

	String name;
	int runs;
	int matches;
	float batting_avg;
	
	
	
	public Batter() {
		super();
	}



	public Batter(String name, int runs, int matches) {
		super();
		this.name = name;
		this.runs = runs;
		this.matches = matches;
		//this.batting_avg = batting_avg;
	}
	
	public void computeBattingAverage() {
		
		if(this.name==null) {
			System.out.println("Name can't be negative ");
		}
		
	else if(this.runs<0 || this.matches<0) {
			System.err.println("Error 1 and runs cant be negative");
			System.exit(0);
		}
		else if(this.runs>0 && this.matches==0) {
			System.err.println("Error 2");
			System.exit(0);
		}
		else {
			this.batting_avg=this.runs/this.matches;
			System.out.println("The name of Batter is "+this.name);
			System.out.println("batting average is "+this.batting_avg);
			
		}
	}
	public void getStatistics() {
		System.out.println("The batter name is "+this.name);
		System.out.println("The Runs is "+this.runs);
		System.out.println("The matches are "+this.matches);
		System.out.println("The batting average is "+this.batting_avg);
		
	}
	
	
}
