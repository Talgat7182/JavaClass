package com.classesAndMethods;

public class Pattern1 {

	
	public static void main(String[] args) {
		
		Pattern1 demo = new Pattern1();
		
		demo.printNumber();
		
		
		
	}
		
    void printNumber() {
           for(int i=1; i<=2; i++) { 
			
			for(int y =0; y<=3; y++) {
				System.out.println(i + " " + y);
			}
		}
	
}
}