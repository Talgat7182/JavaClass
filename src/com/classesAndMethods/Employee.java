package com.classesAndMethods;

 public class Employee {

	String eID;
	int salary;
 static  String CEO = "Samir";

	public static void main(String[] args) {

		Employee obj = new Employee();

		obj.eID = "Sam";
		obj.salary = 100000;
		// obj.CEO = "Samir";

		obj.printIt();

		Employee obj1 = new Employee();
		obj1.eID = "Tom";
		obj1.salary = 200000;
	 //  obj1.CEO = "Talgat";

		obj1.printIt();
		
		
		Employee obj2 = new Employee(); 
		obj2.eID = "Talgat";
		obj2.salary = 200000;
	     //obj2.CEO = "Talgat";
		obj2.printIt();

	}

	void printIt() {

		System.out.println("eID is : " + eID + " " + "salary is " + salary + " CEO is " + CEO);
	}

}
