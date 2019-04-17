package com.classesAndMethods;

public class ConstructorTypes {

	ConstructorTypes() {
		System.out.println(" I am a constructor with no paramaters");
	}

	ConstructorTypes(String str) {
		System.out.println(" I m a cons with 1 param " + str);
	}

	ConstructorTypes(int a, String str) {

		System.out.println("I am a const with 2 parems " + a + " and " + str);
	}
	

	public static void main(String[] args) {

		ConstructorTypes obj1 = new ConstructorTypes();

		ConstructorTypes obj2 = new ConstructorTypes("String");

		ConstructorTypes obj3 = new ConstructorTypes(123, "String");
	}
}
