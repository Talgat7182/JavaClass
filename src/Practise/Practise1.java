package Practise;

public class Practise1 {
	
	
	int modelYear; 
	String modelName; 
	
	
	public static void main(String[] args) {
		
		
		Practise1 obj = new Practise1();
		
		obj.modelName("Toyota"); 
		
		obj.modelYear(2018);
		
	}
	
	public void modelName (String name) { 
		
		System.out.println("Model name is " +name);
		
		
	}
	
	public void modelYear(int year) {
		System.out.println("Model year is " +year);
	}

}
