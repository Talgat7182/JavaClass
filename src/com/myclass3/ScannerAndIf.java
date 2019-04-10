package com.myclass3;
import java.util.Scanner; 
public class ScannerAndIf {
	
	public static void main(String args[]) { 
		
		int num1,num2; 
		
		Scanner scan=new Scanner(System.in); 
		System.out.println("Please enter first number");
		num1=scan.nextInt(); 
		
		System.out.println("Please enter the second number");
		num2=scan.nextInt(); 
		
	
		
		if(num1>num2) {
			System.out.println(num1 +" is larger than "+ num2);}
		else { System.out.println(num1 + " is smaller than "+ num2);
		}
		
	
		
		
	}
	
}
