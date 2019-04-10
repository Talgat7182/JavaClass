package com.arrays;

public class RecapDimensionalArrays {
	public static void main(String[] args) {
		
		int [][] arr = { 
				{1,2,3}, // 1 array that stored with index 0 
				{10,20,30},
				{100,200,300}
		}; 
		
		// how many total arrays
		            //    3
		
		for(int i=0; i<arr.length; i++ ) // our whole array length; 
		  
		  {// 0   array length is 3 ( 3 numbers), it is what we have in our first array; // but the row is 0 
			  for(int j =0; j<arr[i].length; j++)  { //0
		  // 1 // 2
		  
		  System.out.print(arr[i][j] + " "); 
		  } 
		  
		  System.out.println(); 
		  }
		 
		
		System.out.println("-------For each loop-------");
		
		for(int [] singleArray:arr) { // a big umbrella 
			for(int numbers:singleArray) { // {1,2,3} first array
				
				System.out.print(numbers + " ");
		}
		
		System.out.println();
		
	}

}
}
