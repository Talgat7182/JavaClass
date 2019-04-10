package com.myclass3;

import java.util.Scanner;

public class LargestNumberIfnested {
	public static void main(String[] args) {
 int num1,num2,num3; 
		
		Scanner input; 
		input=new Scanner(System.in); 

		System.out.println("Please enter 3 distinct double values");
		num1=input.nextInt(); 
		num2=input.nextInt(); 
		num3=input.nextInt(); 
		
	//nested if
		if(num1>num2) { 
			if(num1>num3) { 
			System.out.println(num1+ " is the largest");}
			// largest=num1; 
			else {System.out.println(num3 +" is the largest");}
			//num3=largest (another way to execute it)
		}
		else { // num2> num1
			if(num2>num3) {
				System.out.println(num2+ " is largest");}
			else {System.out.println(num3 + " is the largest");
			
			}
			}
		// we need to use sysout at the end, when we work without Sysout...
		// System.out.println("the largest number is " + largest); 
		// use debugging to see step by step 
		
	}

}
