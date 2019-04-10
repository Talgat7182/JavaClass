package com.loop;
import java.util.Scanner; 
public class UserInput {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in); 
	
	System.out.println("Please enter a starting number"); 
	int startNumber=input.nextInt(); 
	System.out.println("Please enter a ending number"); 
	int endingNumber=input.nextInt(); 
	
	if(startNumber < endingNumber) { 
	for(int i = startNumber; i<=endingNumber; i++) { 
		System.out.println(i);
	}
	}
	else { System.out.println(" i won't run your code");
		} 
	
}
}
