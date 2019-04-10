package com.classesAndMethods;

public class Greetings1 {

	public static void main(String[] args) {

		Greetings1 obj = new Greetings1();

		// call the method in the main the method

		obj.askHowAreYou("Erlan?");

	}

	void askHowAreYou(String name) {

		System.out.println("How are you " + name);
	}

	void askHowAreYou1(String name) {
		System.out.println("How are you " + name);
	}
	
	void askHowAreYou2(String name) { 
		System.out.println("Kalaisn " + name);
	}

}
