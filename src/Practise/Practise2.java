package Practise;

public class Practise2 {
	
	int modelYear;
	String modelName; 
	
	public static void main(String[] args) {
		
		
		
		Practise2 obj = new Practise2("Toyota", 2018); 
		
		
		
		System.out.println("My car is " + obj.modelName +" and year is "+obj.modelYear);
		
		
		
		
		
	}
	
	public Practise2(String name, int year) { 
		
		modelYear = year; 
		modelName = name; 
		
	}

}
