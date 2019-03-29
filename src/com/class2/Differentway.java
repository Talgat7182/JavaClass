package com.class2;

import java.util.Scanner;

public class Differentway {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double length; 
		double width; 
		double area; 
		double perimeter; 
		
		System.out.println("Enter the length of triangle : ");
		
		length = input.nextDouble();
		
		System.out.println("Enter the width of triangle :");
		width = input.nextDouble();
		
		area = length*width; 
		perimeter=2*(length+width);
		
		System.out.println("the perimeter of tringle with "  + width +" width"+ " and "+ length+" length" +" is equal to "+perimeter + " and the area is "+area +".");
		
		
	}

}
