package com.myclass3;

import java.util.Scanner; 
class SwitchBaC  {
	public static void main(String[] args) {
	
	Scanner input; 
	char grade; 
	String explanation; 
	
	input=new Scanner(System.in); 
	
	System.out.println("Enter your grade");
	grade = input.next().charAt(0); 
	
	
	switch(grade) {
	case 'a': explanation="Excellent"; 
	break; 
	case 'b': explanation="Good"; 
	break; 
	case 'c':explanation="Average"; 
	break; 
	default:explanation="Invalid"; 
	
	}
	System.out.println("your grade is "+ explanation);
	
}

}
