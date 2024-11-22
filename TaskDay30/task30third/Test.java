package com.task30third;

public class Test {

	public static void main(String[] args) {
		TextPost tp=new TextPost("Hello,world!",2);
		tp.publish();
		tp.like();
		tp.like();
		System.out.println("Post "+tp.getTextContent()+"|Likes:"+tp.getLikes());

	}

}

