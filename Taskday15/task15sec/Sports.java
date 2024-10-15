package com.task15sec;

public class Sports {
	
	private String sportName;
	private int teamSize;
	private String sportType;
	public Sports() {
		
	}
	public Sports(String sportName, int teamSize) {
		super();
		if(teamSize<=0)
		{
			System.err.println("Error 1");
			System.exit(0);
		}
		if(sportName==null)
		{

			System.err.println("Error 2");
			System.exit(0);	
		}
	else {
		this.sportName = sportName;
//		if(teamSize<=0) {
//			System.err.println("Team size must be positive");
//					System.exit(0);
//		}
//		else {
		this.teamSize = teamSize;
		
//	}
	}
	}
	public Sports(String sportName, int teamSize, String sportType) {
		super();
		
		if(sportName==null) {
			System.err.println("Error 3");
			System.exit(0);
		}
		if(teamSize<=0) {
			System.err.println("error 4");
			System.err.println("Team size must be positive");
			System.exit(0);
					
		}
		if(sportType==null) {
			System.err.println("Error 5");
			System.exit(0);
		}
		else {
		this.sportName = sportName;
		this.teamSize = teamSize;
		this.sportType = sportType;
	}
	}
	
	
	public void displayInfo() {
//		if(teamSize<=0)
//		{
//			System.err.println("Team size must be positive");
//			System.exit(0);
//		}
//		
//		else {
		System.out.println("sportname is :"+sportName);
		System.out.println("teamSize is :"+teamSize);
		System.out.println("sporttype is :"+sportType);
	
	
	
	}
}
	


