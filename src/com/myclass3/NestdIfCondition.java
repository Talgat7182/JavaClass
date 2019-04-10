package com.myclass3;

public class NestdIfCondition {

	public static void main(String args[]) {

		double gpa = 3.5;
		double expectedGpa = 4;
		boolean hasDiploma = true;

		if (hasDiploma) {
		System.out.println("Congratulations");  

		 if (gpa > expectedGpa) {
				System.out.println("You are accepted ");
			} 
         else if(gpa==expectedGpa) {System.out.println("Might consider");}
			
         else  {
				System.out.println("bye");}
		 
		}
		
		
		
		
		else { System.out.println("try bootcamp or tutorials online");}
		
         
		
		

	//	else { System.out.println("Try bootcamp, it works %100");}
		// when if () { } else if() {] else if(){} else {} goes for the first right

	}
}
