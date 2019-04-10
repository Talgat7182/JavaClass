package com.classesAndMethods;
import java.util.Scanner;

public class VoidType {

	String b;

	// global location
	public static void main(String[] args) {

		VoidType one = new VoidType();

		one.type();

		Scanner sc = new Scanner(System.in);

		one.b = sc.nextLine();

		one.printIt(one.b);

		// one.scannerFirstName();
		/*
		 * one.scannerInt(); one.Stringreverse();
		 */
	}

	// classes have methods

	public void type() {
		System.out.println("No return type");

	}
// make it private --> private
	// make it default by just writing void ---> can access it from different class
	// under the same package
	// make it protected by putting protected

	public void printIt(String name) {

		System.out.println(name);

	}

	/*
	 * void scannerInt() { Scanner scan = new Scanner(System.in); scan.nextInt();
	 * System.out.println(); }
	 * 
	 * void Stringreverse() { String str = " Syntax Technologies"; String reverse =
	 * ""; for (int i = str.length() - 1; i >= 0; i--) { reverse += str.charAt(i);
	 * 
	 * System.out.println(reverse); } }
	 */
}
