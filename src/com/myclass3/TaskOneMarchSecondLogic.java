package com.myclass3;
import java.util.Scanner; 

public class TaskOneMarchSecondLogic {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in); 
		System.out.println("Enter the first person's height");
		Double height1 = input.nextDouble(); 
		
		System.out.println("Enter the second person's height"); 
		Double height2=input.nextDouble(); 
		
		if(height1<5) {
			System.out.println("You are short");}
		else if(height1>=5 && height1<=6) {
			System.out.println("You are meduim");}
		
		else {System.out.println("You are tall");}
		
		if(height2<5) {
			System.out.println("You are short");}
		else if(height2>=5 && height2<=6) {
			System.out.println("You are meduim");}
		
		else {System.out.println("You are tall");}
		
		
		
	}

}
