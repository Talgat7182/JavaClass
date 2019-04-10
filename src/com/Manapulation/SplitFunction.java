package com.Manapulation;

public class SplitFunction { public static void main(String[] args) {
	
	
	
	
	// Split, cuts your strings /     / 
	
	
	String str = "Welcome Syntax Students"; 
	
	str.split("Syntax"); 
	
	String [] array = str.split("Syntax"); 
	
	
	// " "; to indentify how many words we have in the array 
	// how many 
	System.out.println(array.length);
	
	
	for(int i = 0; i<array.length;i++) { 
    
	System.out.println(array[i]);
	}
	
	
	for(String substring :array) { 
		
		System.out.println(substring);
	}
	
	
	
	
}

}
