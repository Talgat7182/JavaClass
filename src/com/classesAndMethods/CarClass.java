package com.classesAndMethods;

public class CarClass {

	public static String make = "Toyota";
	String color; 
	String model;
	int doors;
	boolean engine; 

	CarClass() { // constructor
		System.out.println("I am a Constructor");
		System.out.println("Hello from Constructor");

	}

	public static void main(String[] args) {

		CarClass obj = new CarClass(); // - we are calling our constructor here, we need to declare an object
		// why not create obj? because it is static?
		hello();
		// constructor will give it a value by default "null", 0, false to global unititialised variables; if it was not initialised... 
		// values are given by default by constructor; 
		System.out.println(obj.color); 
		System.out.println(obj.doors);
		System.out.println(obj.engine);

		// Break down of creating a reference variable;
		// CarClass = class name
		// obj = a reference variable or object name
		// = - assigning operator
		// new - keyword creates an object
		// CarClass() - CONSTRUCTOR;
	}

	public static void hello() {
		// before we use a local variabale, we must initialize it 
	//	String name ="";
		//System.out.println(name);
		System.out.println("I am a static hello method");
	}

}
