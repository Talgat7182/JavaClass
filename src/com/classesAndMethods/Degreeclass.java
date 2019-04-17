package com.classesAndMethods;

public class Degreeclass {
	
	public String getDegree() {
		
		return "I got a degree";
	}

}
	
	
	class Undergraduate extends Degreeclass { 
		
		public String getDegree() {
			
			return "I am an Undergraduate"; 
		}
		
	}
	
	
	class Postgraduate extends Degreeclass {
		public String getDegree() { 
			return "I am an Postgraduate";
					
		}
		
}
