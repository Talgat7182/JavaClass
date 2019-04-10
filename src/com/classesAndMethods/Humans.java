package com.classesAndMethods;

public class Humans {
	
	
    String eyeColor = "Brown"; 
	int height = 6;
	int weight = 180; 
	String gender = "Female";
	
	String programmingLanguage = "java";
	
	
	
	void speak() {
		String language = "English"; 
		
		System.out.println("Humans can speak " + language);
		// not accessible from here
	}
	
	
	void printIt() { 
		System.out.println(eyeColor);
	}
	void coding() { 
		System.out.println("Syntax students can code " + programmingLanguage );
	}

}
