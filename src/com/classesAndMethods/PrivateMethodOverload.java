package com.classesAndMethods;

public class PrivateMethodOverload {
	
	
	private void printIt() { 
		System.out.println("Hello");
	}

	private void printIt(String name) {
		System.out.println(name);
	}
	
	private void printIt(String name, String lastName) {
		
		System.out.println(name +"" +lastName);
	}
}
