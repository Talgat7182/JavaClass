package com.classesAndMethods;

public class SyntaxStudent {

	/*
	 * schoolName Batch # studentName studentLastName
	 * 
	 * 
	 * method to print all the details of the student getStudentDetails
	 * 
	 * 
	 */

	public static String schoolName = "Syntax";
	public static int batchNumber = 4;

	public String studentName;
	public String studentLastName;
	
	
	public SyntaxStudent(String name, String lastName) { 
		studentName = name; 
		studentLastName = lastName; 
	}
	


	public void getStudentsDetails() {
		String details = "I am a student at " + schoolName + " from batch " + batchNumber + " and my name is "
				+ studentName + " " + studentLastName;
		System.out.println(details);
		

}


}
