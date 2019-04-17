package com.classesAndMethods;

public class ConstructorOverloading {

	
	ConstructorOverloading() {
		
		System.out.println("I am a constructor with no parameters");
	}
	
	
	ConstructorOverloading(String str) {
		
		System.out.println("I am a constructor with two paremeters");
	}
	
	ConstructorOverloading(String str,String str2) {
		System.out.println("I am a constructor with two parameters");
	}
	ConstructorOverloading(int a) {
		System.out.println("I am a constructor with integer datatype parameter");

}
}
