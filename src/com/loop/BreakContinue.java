package com.loop;

public class BreakContinue {
public static void main(String[] args) {
	

	for(int i = 1; i<=10; i++) { 
		if(i==5) {break; } // break takes you out of the loop
		
		System.out.println(i);
}
	
	
	// continue
	for(int i =0; i<6; i++) { 
		if(i==2) { 
			continue;  // jump back to the condition 
			
			
		}
		System.out.println(i);
		System.out.println("Hello");
	}
	System.out.println("I am outside the for loop");
	
	// I want to print number from 1 to 20 but skip those that divisible by /3; 
	
	for(int a = 1; a<=20; a++) { 
		if(a%3==0) { continue; 
		
		}
		System.out.println(a);
	}
}

}


