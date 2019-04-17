package com.LoopNested;

public class NestedLoop1 {
	
	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) { 
			// all the iteration is gonna get executed and then it will come out of the inner loop 
		
			//System.out.println("------I am outer loop------"+i);
			
			for(int y=0; y<3; y++) {
				
				System.out.println("i am in inner loop" +i+y );
			}
			System.out.println();
		
		}
	}

}
// 0 0 
//0 1
// 0 2 
// 