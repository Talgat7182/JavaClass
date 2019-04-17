package com.classesAndMethods;

public class SimpleTestOverLoad {
	
	public void test(int a) {
		System.out.println("I am public method" );}
	
	protected void test() {
		System.out.println(" I am protected method"); }
	
	void test(String str) {
		
		System.out.println("I am default method");
	}
	
	void test(String str, int a) {
		
		System.out.println("I am defaul method");
	}
	
	
	

}
