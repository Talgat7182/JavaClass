package com.loop;
import java.util.Scanner; 
public class TaskThree { 
	public static void main(String[] args) {
		
		Scanner input; 
		String name; 
		int a = 1; 
		
		input = new Scanner(System.in); 
		
		while(a<=3) { System.out.println("Please enter your name");
		name = input.nextLine(); 
		System.out.println("How are you " + name + "?");
		
		a++; 
		}
		
	}
}