package com.Manapulation;

public class toCharArray {
public static void main(String[] args) {
	
	
	// toCharArray() - converts string to an array of characters; 
	
	String str= "Saturday"; 
	
	         // new name but it refers to str
	// this part is important 
	  char [] array = str.toCharArray();
	
	for(int i=array.length-1; i>=0; i--) { 
	
	

		System.out.print(array[i]);
	}
	
	
	System.out.println();
	
     System.out.println(array.length);
	
	
	for(char c:array) { 
	System.out.print(c);
	}
	
	// Reverse 
	
	for(int i = array.length - 1; i>=0; i--) { 
		System.out.println(array[i]);
	}
	
	// reverse a string without using a reverse function 
	
	String original  = "Today is Java Class"; 
	String reverse = ""; 
	
	char [] array1 = original.toCharArray(); 
	
	for(int i = array1.length-1; i>=0; i--) { 
		
		reverse = reverse +array1[i]; 
		
	}
	System.out.println("reversed string is " + reverse);
		
		// 2 charAt(); 
		System.out.println("---Reverse1----");
		
		String reverse1 = ""; 
		
		
		for(int y = original.length()-1; y>=0; y--) { 
			
		
			reverse1= reverse1 +original.charAt(y); 
			
			
			
			//System.out.println(reverse1);
		}
	
    System.out.print(reverse1);
    System.out.println();
		
		

    String str3 ="Today is Sunday Java class";
	String newString = str3.substring(9);	

	System.out.print(newString);


 
     System.out.println();
	
	
	   
    
    String reversed3 ="";
    
    String original1  = "Today is Java Class"; 

	System.out.print(original1.length());
 
  System.out.println();
    
    for(int i =original1.length(); i>0; i--) { 
    	
    	reversed3=reversed3+ original1.substring(i-1,i); 
    	//19 -1 = 18                             18, what is the second i for? what value does it store?
    	//1-1=0
    
    
    }


         System.out.print(reversed3);
    	System.out.println();
    }
   
    
    
}

