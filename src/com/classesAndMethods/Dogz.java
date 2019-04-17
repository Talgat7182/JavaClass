package com.classesAndMethods;

public class Dogz {

	// for now just attributes

	static String breed = "Husky";
	static int paws = 4;
	String name;
	int weight;
	int height;

	public static void main(String[] args) {

		Dogz dog1 = new Dogz();
		Dogz dog2 = new Dogz();
		Dogz dog3 = new Dogz();
		// 1 dog
		dog1.name = "Mardy";
		dog1.weight = 60;
		dog1.height = 40;
		dog1.getDogzProperties();
		// 2 dog
		dog2.name = "Waffle";
		dog2.weight = 100;
		dog2.height = 90;
		dog2.getDogzProperties();
		// dog 3
		breed = "Pug";
		dog3.name = "Lucy";
		dog3.weight = 20;
		dog3.height = 30;
		dog3.getDogzProperties();

		
		dog1.getDogzProperties();
		dog2.getDogzProperties();
		System.out.println(breed);

		// 3 ways of accessing static variables
		System.out.println(breed);
		System.out.println(Dogz.breed);// by class name
		System.out.println(dog3.breed);// by object reference -- not preferred way..

	}

	public void getDogzProperties() {
		System.out.println(name + " is a breed of " + breed + " and weight is " + weight + " and height is " + height);
	}
}
