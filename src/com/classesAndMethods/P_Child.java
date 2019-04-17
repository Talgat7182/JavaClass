package com.classesAndMethods;

public class P_Child extends Parent {

	String hairType = "curly";

	public static void main(String[] args) {

		P_Child child1 = new P_Child();

		System.out.println("Child 1 eye color is " + child1.eyeColor);
		System.out.println("Child 1 eye color is " + child1.hairColor);
		System.out.println("Child 1 eye color is " + child1.ears);
		System.out.println("Child has "+child1.hairType+" hair");

	child1.speakThreeLanguages();
      
	child1.canPlayGuitar();
	}
	
	public void canPlayGuitar() {
		
		System.out.println("Child 1 can play the guitar well");
	}

}
