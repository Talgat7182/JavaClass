package com.classesAndMethods;

public class computer {

	String screen, os, brand;
	boolean keyboard, mouse;
	int ram;

	public static void main(String[] args) {

		computer com1 = new computer();

		com1.keyboard = true;
		com1.ram = 8;
		com1.os = "Windows";
		com1.screen = "Touch screen";
		com1.mouse = true;
		com1.brand = "HP";

		// we define the behaviour
		com1.watchMovie();
		com1.doJavaCoding();
		com1.playMusic();

		computer com2 = new computer();

		com2.keyboard = false;
		com2.ram = 6;
		com2.os = "Mac OS";
		com2.screen = "touch screen";
		com2.mouse = false;
		com2.brand = "Apple";

		com2.watchMovie();
		com2.doJavaCoding();
		com2.playMusic();

	}

	// we added the brand to specify
	void watchMovie() {
		System.out.println("we can watch a movie on the computer" + " " + brand);
	}

	void doJavaCoding() {
		System.out.println("We can do Java coding on our computer" + " " + brand);
	}

	void playMusic() {
		System.out.println("we can play music on our computer" + " " + brand);

	}

}
