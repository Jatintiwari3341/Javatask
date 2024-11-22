package com.task30third;

public class TextPost implements Post {
	
	private String textContent;
	private int likes;
	
	

	public TextPost(String textContent, int likes) {
		super();
		if(textContent==null) {
			System.err.println("Text content cannot be empty");
		}
		this.textContent = textContent;
		this.likes = 0;
	}

	
	public String getTextContent() {
		return textContent;
	}


	public int getLikes() {
		return likes;
	}


	@Override
	public void publish() {
System.out.println("The publish post :"+textContent);		


	}

	@Override
	public void like() {
		likes++;
		System.out.println("Post Liked!Total likes: "+likes);

	}

}
