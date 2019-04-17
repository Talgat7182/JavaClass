package com.classesAndMethods;

public class TestEmployees {

	
	
	public static void main(String[] args) {
		
		
		
		Employee1 emp = new Employee1();
		
		FulltimeEmployee emp1 = new FulltimeEmployee();
		
		ContractorEmployee emp2 = new ContractorEmployee(); 
		
		emp.getPaid();// goes to parent class
		emp1.getPaid();
		emp2.getPaid();
	}
}
