package com.classesAndMethods;

public class EmployeeST {
	// instance variable
	int salary;
	protected int salary1;

	protected static String nameOfCompany = "Apple";
	// it was public, changed to default
	// we all work in IT dept.

	// static String department ="IT";
	protected static String department = "IT";
	// we can access protected, default...

	// non static, because salary is an instance
	// private members do not get inherited

	public void getPaid() {

		System.out.println("Employees gets paid  " + salary);
	}

	// for waterfall class
	protected void culture() {
		System.out.println("Gainers gain");
	}

	// for waterfall class
	void test() {
		System.out.println("we take testing seriously!");
	}

	public static void work() {

		System.out.println("Employees work in " + department + " department" + " for " + nameOfCompany);

	}
}
