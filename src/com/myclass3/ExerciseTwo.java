package com.myclass3;
import java.util.Scanner; 
public class ExerciseTwo {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in); 
		 int age; 
		 
		 System.out.println("Enter your age");
		 age = scan.nextInt(); 
		 
		 if(age==18 ||age >18 ){ 
			 System.out.println("I can issue you a driving license");
			 
		 }
		 else { System.out.println(" I can not issue you a driving license");}
		
	}

}
