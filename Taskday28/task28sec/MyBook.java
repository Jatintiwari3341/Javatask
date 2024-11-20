package com.task28sec;

public class MyBook extends Book {

	@Override
	public void setTitle(String Title) {
		this.Title=Title;
		
	}
	@Override
	public String getTitle() {
		return " the Title of the book is :"+super.Title;	}
	

}
