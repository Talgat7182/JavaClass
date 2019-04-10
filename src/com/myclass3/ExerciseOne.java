package com.myclass3;
import java.util.Scanner; 
public class ExerciseOne {
	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in); 
		int amount; 
		
		System.out.println("Please enter the amount of need loan: ");
		
		amount = scan.nextInt(); 
		
		if(amount<200000) {
			System.out.println("I can lend you money");
			
		}
		else { System.out.println("I can not lend you money");}
		
		
		
	}

}
