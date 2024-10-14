package com.task13sec;

public class MovieDemo {

	public static void main(String[] args) {
		Movie m1=new Movie("RRR",2023,"Action");
		System.out.println(m1);
		m1.setTitle("kalki");
		m1.setReleaseYear(2024);
		m1.setGenre("Adventure");
		System.out.println(m1);		
//		System.out.println(m1);
//		m1.setReleaseYear(m1.getReleaseYear()+1);
//		System.out.println(m1);
//		m1.setGenre(m1.getGenre()+"Adventure");
//		System.out.println(m1);

	}

}
