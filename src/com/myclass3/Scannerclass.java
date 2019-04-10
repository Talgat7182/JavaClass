package com.myclass3;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {

		Scanner tuna = new Scanner(System.in);
		System.out.println("Please enter your name and mark: ");
		String name = tuna.nextLine();
		String mark = tuna.nextLine(); 
	
		
		System.out.println("Good morning " + name +mark);
	}

}
