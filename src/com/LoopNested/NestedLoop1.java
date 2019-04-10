package com.LoopNested;

public class NestedLoop1 {
	
	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) { 
			// all the iteration is gonna get executed and then it will come out of the inner loop 
			
			for(int y=0; y<3; y++) {
				
				System.out.println( " I am inner loop "+y);
			}
			
			System.out.println("------I am outer loop------");
			
		}
	}

}
