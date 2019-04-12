package com.classesAndMethods;

public class InstanceVariables {
	// this is a global variable;
	String name = "John";

	public static void main(String[] args) {
		// not visible to my class, local variable
		String name = "Anna";
		System.out.println(name);

		InstanceVariables obj = new InstanceVariables();

		System.out.println(obj.name);
		System.out.println("---Changing Value of Instance----");
		// you can change/ override it under each object
		obj.name = "Jack";
		System.out.println(obj.name);

		// obj & obj1 do not communicate.... that is why it goes to the global to access
		// its copy;
		InstanceVariables obj1 = new InstanceVariables();
		// each gets its own copy
		System.out.println(obj1.name);
	}
	public void hello() { 
		System.out.println("Hello "+ name);
		
		// TestInstanceVaribales --> go there to test
	}

}
