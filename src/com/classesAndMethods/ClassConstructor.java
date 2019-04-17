package com.classesAndMethods;

public class ClassConstructor {

	ClassConstructor(String a) {
		System.out.println("I have a parameter " + a);
	}

	ClassConstructor() {
		System.out.println("I have no parameter");
	}

	

	
	public static void main(String[] args) {
		
		
		ClassConstructor obj = new ClassConstructor("Awesome"); 
		
		ClassConstructor obj1 = new ClassConstructor(); 
	}
}