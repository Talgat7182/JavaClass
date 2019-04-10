package com.classesAndMethods;

public class ReturnType {

	public static void main(String[] args) {

		ReturnType kiwi = new ReturnType();

		String names = kiwi.name();

		// System.out.println(kiwi.name("Tayap"));

		System.out.println("His name is " + names);

		// System.out.println("His name is " +kiwi.WhatIsHisName));

	}

	String name() {

		return "Talgat";
	
	}
	
}