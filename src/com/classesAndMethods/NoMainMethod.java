package com.classesAndMethods;

public class NoMainMethod {
	
	String str; 
	int num; 

	
	
	void hello() { 
		System.out.println("Hello");
		System.out.println("Hello firends");
	}
void bye() {
	System.out.println();
}

public static void main(String []args) // method signature and what is inside i called method body..
{
	
	NoMainMethod obj = new NoMainMethod(); // new creates an object; new instance of the class gets created // instanciated

	obj.hello();
}
}
