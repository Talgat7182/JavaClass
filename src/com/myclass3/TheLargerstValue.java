package com.myclass3;

import java.util.Scanner;

public class TheLargerstValue {
	public static void main(String[] args) {

		double num1,num2,num3; 
		
		Scanner input; 
		input=new Scanner(System.in); 

		System.out.println("Please enter 3 distinct double values");
		num1=input.nextDouble(); 
		num2=input.nextDouble(); 
		num3=input.nextDouble(); 
	
  if(num1>num2 && num1>num3) {System.out.println(num1 + " is largest");}
   else if(num2>num1 && num2>num3) {System.out.println(num2 + " is larehest");}
   else if(num3>num1 && num3>num2) {System.out.println(num3 + " is larehest"); }
	
}
}
// if nested 
 // if(num1>num2){  
// if(num1>num3){ sysout( num1 + " is the largest")