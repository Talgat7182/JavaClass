package com.myclass3;

public class IfStatements {
	public static void main(String args[]) {
		
	int tripPrice = 3200; 
	int allowedPrice = 3500; 
	
	int a = 200; 
	int b = 145; 
	boolean result = a>b;
	
	System.out.println(result);
	
	if(a < b) { 
		System.out.println("Hello");
		
	} else {System.out.println("Salem");}
	if(tripPrice <=3500) {
		System.out.println("You can travel");
	}
	else { System.out.println("You can't travel");
	}
	}
	
}

