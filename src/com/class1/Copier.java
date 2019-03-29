
package com.class1;
import java.util.Scanner;


public class Copier {
	public static void main(String[] args) {
		Scanner kiwi = new Scanner(System.in);
		String a; 
		// Another option, faster; 
		//System.out.println(kiwi.nextLine());
		
		System.out.println("Enter a line of text :");
		
		a = kiwi.nextLine(); 
		// String line = kiwi.nextLine(); if not declared above, we can declare after System.out........
		System.out.println("You entered: " + a); 
		
		
	}

}
