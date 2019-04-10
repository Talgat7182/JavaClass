package com.Manapulation;

public class LiveQuestions {
public static void main(String[] args) {
// largest, 2nd largest, maximum &minimum 	
	int [] arr = { 20000,1000, 2, 3,106,303, 56,89,-1,0}; 
	
	int largest = 0; 
	int secondLargest = 0;
	
	
	for (int i = 0; i < arr.length; i++) {
		 
		if (arr[i] > largest) {
			secondLargest = largest;
			largest = arr[i];

		} else if (arr[i] > secondLargest && secondLargest<largest) {
			secondLargest = arr[i];

		}
	}

	System.out.println("\nSecond largest number is:" + secondLargest);

	
	String str = "My name is Talgat"; 
	str.split(" "); 
	String []array = str.split(" "); 
	
	System.out.println(array.length);
	
	
	String str2 = "My name is Talgat"; 
	char [] array1 = str2.toCharArray();
	for(int i =array1.length-1; i>=0; i--) {
		
		System.out.print(array1[i]);
	}
	
}
}
/*
 * for(int i = str.length()-1; i>=0; i--) {
 * 
 * System.out.print(str.charAt(i)); }
 */
	
	/*String a = "Is it Saturday! Is it raining! Do we have a Java Class today!"; 
	//{ }; 
	//{]
	//{ }
	//{ }
    a.split("!"); 
    String [] array2 =a.split("!"); 
  
    for(int rows =array2.length-1; rows>=0;rows--); 
    		{ for(int col =)
    	
    
    System.out.println(array2.length);
    }
    
}
}
*/
