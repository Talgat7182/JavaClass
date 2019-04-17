package com.classesAndMethods;

public class Addition {

	// 1 st way to overload
	// i am doing overloading by changing number of parameters.
	// and the methods consequently behave differently

	// 2nd way to overload by passing different data type of parameters

	public void add(int a, int b) {
		System.out.println("Method to add 2 integers");

		System.out.println(a + b);
	}

	public void add(int a) {

		System.out.println(a + 100);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	// 2. overloading method by changing the data type of the parameters
	public void add(double a, double b) {
		System.out.println(a + b);
	}

	public void add(double a, double b, double c) {
		System.out.println(a + b + c);

	}

}
