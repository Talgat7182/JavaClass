package com.Manapulation;

import java.util.Scanner;

public class Exer3AnotherWay { public static void main(String[] args) {
	

	
	Scanner input;
	String nameMom; 
	String nameDad; 
	String gender; 
	String babyName="";
	
	input = new Scanner(System.in); 
	System.out.println("Enter Mom's name: ");
	nameMom=input.nextLine();
	System.out.println("Enter Dad's name: ");
	nameDad = input.nextLine(); 
	
	System.out.println("Boy or Girl?");
	gender = input.nextLine(); 
	
	if(gender.equalsIgnoreCase("Boy")) {
		babyName = "Danry"; 
		
	}
	
	else { babyName = "Maiel"; }
	
	System.out.println("Suggested baby name is " +babyName);
	
	
	
	
}

}
