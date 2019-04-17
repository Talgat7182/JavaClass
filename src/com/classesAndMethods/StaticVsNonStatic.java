package com.classesAndMethods;

public class StaticVsNonStatic {

	// global variables are accesible throught the class

	public static String name = "John"; // instance variable

	public static String lastName = "Snowden"; // static variable

	public static void main(String[] args) {

		StaticVsNonStatic obj = new StaticVsNonStatic();

		obj.getInfo(); //
		
		obj.getInfo1();//calling our static method within the same class, by using method/variable nam
       System.out.println(lastName);
        System.out.println(obj.name);
	}

	// non static - can access both,instance & static variables;
	public void getInfo() {
		System.out.println("My name is " + name + " My last name is " + lastName); }
		// getInfo1(); we can access static methods within non static	}

	// static method can have an access only to static variables
	public static void getInfo1() {
		System.out.println("My name is " + name + " My last name is " + lastName);
		// getInfo1(); we cannot access non static method within static 
	
	}
	
}
