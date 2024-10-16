package com.task16third;

public class Task {
	
	private String title;
	private String description;
	private String priority;
	//private boolean iscomplete=false;
	public Task(String title, String description, String priority) {
		super();
		this.title = title;
		this.description = description;
		this.priority = priority;
	}
	
	public void updatedDescription(String newDescription) {
		this.description=newDescription;
	}
	
	public void updatePriority(String newPriority) {
		this.priority=newPriority;
		
	}
	
	public void markAsCompleted() {
//		System.out.println("the task is completed");
	//	this.iscomplete=true;
		isCompleted();
	}
      public String getTitle() {
    	  return this.title;
      }
      public String getDescription() {
    	  return this.description;
    	  
      }
      public String getPriority() {
    	  return this.priority;
      }
      public boolean isCompleted()
      {
    	  //return this.iscomplete;
    	  if(priority.equalsIgnoreCase("high"))
    	  {
    		  return false;
    	  }
    	  else
    	  {
    		  return true;
    	  }
      }
}
