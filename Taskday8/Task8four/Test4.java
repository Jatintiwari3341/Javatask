package com.Task8four;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
        int num=sc.nextInt();
        int s=0,r;
		int p=1;

        
        while(num>0) {
        	    		
    		r=num%10;
    	    s=s+r;
    	       p=p*r;
    	    num=num/10;
        
    	    if(p==s) {
    	    	System.out.println("spy number");
    	    }
    	    else {
    	    	System.out.println("not a spy number");
    	    	sc.close();
    	    }

        }
        
	}
	}


