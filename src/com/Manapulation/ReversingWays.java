package com.Manapulation;

public class ReversingWays { 
	public static void main(String[] args) {

		
		
		  // String str = "Students"; // // char character = str.charAt(4); // //
		  System.out.println(character); // //
		  System.out.println("---------Accessing characters of a String--------------"
		  ); // System.out.println("-------------Use charAt(index)----------"); //
		  System.out.
		  println("-------------Access words you can use just variable without charAt(index)-------------"
		  ); // String str2 = "Syntax"; // for (int i = 0; i <str2.length(); i++) { //
		  // System.out.print(str2.charAt(i)+ ","); // // } // System.out.println(); //
		  // System.out.
		  println("-------------toCharArray Way of Reversing---------------------"); //
		  // String str3 = "Hello World"; // // convert string to char array first //
		  char [] array = str3.toCharArray(); // // then access char that accesses the
		  string // for(int i=array.length-1; i>=0; i--) { // // // //
		  System.out.print(array[i]); // // } // //
		  System.out.println("----------ForEachLoop-----------------"); // // // access
		  char, create a new variable and access the variable that was given to the
		  char array, when created; // for(char c:array) { // System.out.print(c); //
		  // } // // System.out.
		  println("------------Reverse with charArray and charAt(index)----------"); //
		  // String original = "Today is Java Class"; // String reversed = ""; // //
		  char [] java = original.toCharArray(); // // for(int i = java.length - 1; i
		  >=0; i--) { // reversed+= java[i]; // //System.out.print(java[i]); // } // //
		  System.out.println(reversed); // //
		  System.out.println("---------------CharAt-----------------"); // // String
		  original2 = "I am working on Java"; // String reserved2 =""; // for(int i =
		  original2.length()-1; i>=0; i--) { // // reserved2+=original2.charAt(i); //
		  // System.out.print(original2.charAt(i)); // } //
		  System.out.println(reserved2); //
		  System.out.println("---------Reversing with Substring---------------");
		  
		 
		 	
		String reversed3 ="";
		    
		    String original1  = "Today is Java Class"; 
            // size is 19 
		//	System.out.print(original1.length());
		 
		  System.out.println();
		   		    for(int i =original1.length(); i>0; i--) {  

		    	
		    	reversed3=reversed3+ original1.substring(i-1,i); //19
		    	//19 -1 = 18                             18  
		    	//1-1=0
		    	 
		    
		    }

			    	System.out.println(reversed3);

		      //   System.out.println();
	
 }
	               
}
