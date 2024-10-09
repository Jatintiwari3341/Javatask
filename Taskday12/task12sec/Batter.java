package com.task12sec;

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
//	this.batting_avg = batting_avg;
}

public void computeBattingAverage() {
     //System.out.println(name);
	if(this.name==null)
	{
		System.out.println("name cant be empty");
		System.exit(0);
	}
	else if(this.runs<0) {
		System.out.println("runs and matches must be non negative");
		System.exit(0);
	}
		
	
	else if(this.runs<0 || this.matches<0) {
		System.err.println("error 1");
		System.exit(0);
	}
	else if(this.runs>0 && this.matches==0) {
		System.out.println("error 2");
		System.exit(0);
	}
	else {
		this.batting_avg=this.runs/this.matches;
		System.out.println("The name of Batter is "+name);
	
		System.out.println("Batting average is "+batting_avg);
	}
}
public void getStatistics() {

	System.out.println("Batter Name: "+this.name);
	System.out.println("Batter runs is "+this.runs);
	System.out.println("Batter matches are "+this.matches);
}

}
