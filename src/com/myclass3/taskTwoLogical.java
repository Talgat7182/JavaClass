package com.myclass3;

import java.util.Scanner;

public class taskTwoLogical {
	public static void main(String[] args) {
	
	Scanner input; 
	double quiz; 
	double midterm; 
	double finalScore; 
	double avgScore; 
	
	input=new Scanner(System.in); 
	System.out.println("Enter your quiz score");
	quiz=input.nextDouble(); 
	
	System.out.println("Enter your midterm score");
	midterm=input.nextDouble(); 
	
	System.out.println("Eneter your final score");
	finalScore=input.nextDouble();
	 avgScore=(quiz+midterm+finalScore)/3; 
	System.out.println("Your average score is: " +avgScore);
	
	if(avgScore>=90) {System.out.println("grade is A");}
	else if(avgScore>=70 && avgScore<90) {System.out.println("grade is B");}
	else if(avgScore>=50 && avgScore<70) {System.out.println("grade is C");}
	else if(avgScore<50) {System.out.println("your grade is F");}
	else { System.out.println("You didn't attend the classes");}
}

}
