package com.classesAndMethods;

public class Employee {
	
	
	int eID; 
	int salary; 
	String CEO = "Samir"; 
	
	public static void main(String[] args) {
		
		Employee obj =new Employee(); 
		
		obj.eID = 1; 
		obj.salary =100000; 
		//obj.CEO = "Samir"; 
		
		obj.printIt();

		Employee obj1 = new Employee(); 
		obj1.eID = 2; 
		obj1.salary = 200000; 
		obj1.CEO = "Talgat";
		
		obj1.printIt();
		
		
		
		
	}
	void printIt() {
		
		System.out.println("eID is : " + eID +" "+ "salary is "+ salary + " CEO is " +CEO) ;
	}
	
	
}
