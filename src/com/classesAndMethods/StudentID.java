
package com.classesAndMethods;


	public class StudentID {
		String studentNames;
    	static int numberOFStudennts;
		int studentID;

		/*
		 * 2. Create a Class called Students Create three variables
		 * studentNames,studentID and numberOfStudents Create three objects of the
		 * Students Class Set the value for studentName ,studentID and increment the
		 * numberOfStudents for each objectPrint out total number of students
		 */

		public static void main(String[] args) {

			StudentID obj1 = new StudentID();
			StudentID obj2 = new StudentID();
			StudentID obj3 = new StudentID();

			obj1.studentNames = "Alex";
			obj1.studentID = 123;
		//	studentID++;
			numberOFStudennts++;
			
			//System.out.println(numberOFStudennts++ + " " + obj1.studentNames + obj1.studentID);

			obj2.studentNames = "Alin";
			obj2.studentID = 123;
			numberOFStudennts++;
		//	studentID++;
			//System.out.println(numberOFStudennts++ + " " + obj2.studentNames + obj2.studentID);

			obj3.studentNames = "Obama";
			obj3.studentID = 234;
			numberOFStudennts++;

			//studentID++;
		//	System.out.println(numberOFStudennts++ + " " + obj3.studentNames + obj3.studentID);

			System.out.println("Students' names are: "+obj1.studentNames +","+obj2.studentNames+","+obj3.studentNames +". The total number of students " + numberOFStudennts++);

		}

	}
