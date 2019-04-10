package com.loop;

public class TasktwoIncDec {public static void main(String[] args) {
	
	// pre-increment--->first increment --> then assign 
	int a = 10; 
	int b = ++a; 
	
	//  post increment--->first assign --> increment 
	int c = 10; //11
	int d = c++; //10 
	
	System.out.println(a);//11
	System.out.println(b);//11
	
	System.out.println();
	
	System.out.println(c);
	System.out.println(d);
	
}

}
 