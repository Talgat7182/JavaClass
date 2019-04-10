package com.classesAndMethods;
public class DogClass1 {

	String breed;

	public static void main(String[] args) {

		DogClass1 obj = new DogClass1();

		obj.breed = "Husky";

		obj.bark();
		obj.run();
		obj.play();

		DogClass1 obj1 = new DogClass1();

		obj1.breed = "Bulldog";
		obj1.bark();
		obj1.run();
		obj1.play();

		DogClass1 obj2 = new DogClass1();

		obj2.breed = "Labrador";

		obj2.bark();
		obj2.run();
		obj2.play();

	}

	void bark() {
		System.out.println(breed + " can bark");
	}

	void run() {
		System.out.println(breed + " can run");
	}

	void play() {
		System.out.println(breed + " can play");
	}


}

