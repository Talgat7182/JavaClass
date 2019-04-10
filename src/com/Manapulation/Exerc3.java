package com.Manapulation;
import java.util.Scanner; 
public class Exerc3 { public static void main(String[] args) {
	

	
	
	/*
	 * Write a program that reads two people’s first names and if they expecting boy
	 * or girl? Based on the input suggests a name for a baby: Example Output: Mom’s
	 * first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested baby
	 * name: DANRY
	 * 
	 * Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl?
	 * girl Suggested baby name: MAIEL Posted in #live_questions
	 */

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
