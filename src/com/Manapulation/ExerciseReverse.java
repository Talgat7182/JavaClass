package com.Manapulation;

public class ExerciseReverse { public static void main(String[] args) {
	
	
	
	String day = "Sunday";// 6 size 
	//
	
	                //  5 4 3 2 1 0
	for(int i =(day.length()-1); i>=0; i--) {
		
		System.out.print(day.charAt(i));
	}
	
	
		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String
		 * 
		 * 
		 */

	String name = new String("Saturday"); 
	
	if(!name.isEmpty()) { 
		if(name.length()%2!=0 && name.length()>=3){ 
			System.out.println(); 
		}
	}


	
	

}

}