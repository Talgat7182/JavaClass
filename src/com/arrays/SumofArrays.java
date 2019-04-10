package com.arrays;

public class SumofArrays {
public static void main(String[] args) {
	
	
	int [] numbers= { 0,20,4,5,1}; 
	
	int sum=0; 
	
	for(int i=0; i<numbers.length; i++) { 
		
		sum+=numbers[i];
		
	}
	
	System.out.println(sum);
	
}
}
