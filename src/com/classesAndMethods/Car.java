package com.classesAndMethods;

public class Car {

	// attributes should be inside the class;
	// actions / behaviour

	// we defined our features;
	String make, model, color;
	int door, wheels;

	public static void main(String[] args) {

		// ClassName variableName = new ClassName();
		// 1 Object
		// it accesses its own unique features from class
		Car car1 = new Car();
		car1.make = "Honda";
		car1.model = "Civic";
		car1.color = "Black";
		car1.door = 4;
		car1.wheels = 4;
		System.out.println("Car " + car1.make + " has " + car1.wheels + " wheels");

		// 2nd Object

		Car car2 = new Car();
		car2.make = "Tesla";
		car2.model = "X";
		car2.color = "Blue";
		car2.door = 4;
		car2.wheels = 4;

		System.out.println("My car is " + car2.color + " " + car2.make);

		// Define behaviour
		// car1 referig to the first object;
		// it will execute it, because it finds the method void, where we declared void dirve, reverse,stop....
		// it executes the void method and goes back 
		car1.drive();
		car1.reverse();
		car1.stop();
		System.out.println("---------------Second Object------------------");
       // car2.drive();
	}

	// give a name to your behaviour
	// it is inside the class, but outside the main method
	// open & close body
	// behaviour got the copy as well
	void drive() {
		System.out.println("Car can drive");

	}

	void reverse() {
		System.out.println("Car can reverse");
	}

	void stop() {
		System.out.println("Car can stop");
	}

}
