package com.classesAndMethods;

public class ApplicationAnimal {

	
	public static void main(String[] args) {

	
	Animal obj = new Animal(); 
	 
	obj.name = "Vini puh"; 
	
	obj.age = 40; 
	
	System.out.println(obj.name + " " +obj.breed +" " + obj.age +" "+ obj.weight);
     
	
	// when we use static, we can access it without objects
    
	  System.out.println(Animal.canDocommands());
	System.out.println(Animal.canBark());
	
	
	
	Animal obj1 = new Animal(); 
	
	//obj1.name ="Konfu Panda"; 
	
	System.out.println(obj1.name + " " +obj1.breed +" " + obj1.age +" "+ obj1.weight);
	
}
	
	
	
}
