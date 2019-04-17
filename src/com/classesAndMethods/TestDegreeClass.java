package com.classesAndMethods;

public class TestDegreeClass {

	public static void main(String[] args) {

		Degreeclass dc = new Degreeclass();
		Undergraduate uc = new Undergraduate();
		Postgraduate pc = new Postgraduate();

		String degreeLevel = dc.getDegree();
		System.out.println("my degree is " + degreeLevel);

		degreeLevel = uc.getDegree();
		System.out.println("my degree is " + degreeLevel);

		degreeLevel = pc.getDegree();
		System.out.println("my degree is " + degreeLevel);

	}
}
