package com.classesAndMethods;
import java.util.Scanner;

public class DogClass {

  String breed,name,color; 
  String sc; 
 
  public static void main(String [] args) { 
    
    DogClass obj = new DogClass(); 
   
     
   // obj.breed="";
    Scanner input = new Scanner(System.in); 
    for(int i =1; i<=3; i++) { 
      //sc = input.nextLine();
    
    	obj.breed = input.nextLine();
    
     
      obj.bark(obj.breed); 
      obj.run(obj.breed);
      obj.play(obj.breed);
    }
   
  }
  
  
  void bark(String name){ 
    System.out.println(name +" can bark"); 
    
  
}
void run(String name) { 
  System.out.println(name +" can run"); 
}
void play(String name) { 
  System.out.println(name+ " can play"); 
  }
  
  }






















/*
 * obj.bark(); obj.run(); obj.play();
 * 
 * DogClass obj1 = new DogClass();
 * 
 * obj1.breed ="Bulldog"; obj1.name ="Panda"; obj1.color = "brown";
 * 
 * obj1.bark(); obj1.run(); obj.play();
 * 
 * DogClass obj2 = new DogClass();
 * 
 * obj2.breed ="Bulldog"; obj2.name ="Panda"; obj2.color = "brown";
 * 
 * obj2.bark(); obj2.run(); obj2.play();
 */
