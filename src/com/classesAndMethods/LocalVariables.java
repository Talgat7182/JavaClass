package com.classesAndMethods;

public class LocalVariables {
	
	
	public static void main(String[] args) {
		
		
		// it is a local variable & it is visible only to the main method
		// your main method is an entry method for the execution 
		// name will be passed to the argument; 
		String name ="John Travolta"; 

		
		LocalVariables obj = new LocalVariables(); 
		obj.hello(name);
		System.out.println(name);
	}

	// non static 
	// it is not the same as the name above in the line 17 ) 
	// as soon as it executes, it dies, not available anymore then 
	public void hello(String name) {
		name ="Jack";
		
		System.out.println("Hello " + name);
	}
	
}
