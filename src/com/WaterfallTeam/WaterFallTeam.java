package com.WaterfallTeam;
// we need to import package name & class name to access 
import com.classesAndMethods.EmployeeST;
// then we do inheritance 
public class WaterFallTeam extends EmployeeST{
	
	public static void main(String[] args) {
		
		WaterFallTeam obj = new WaterFallTeam();
		
		obj.salary1 = 90000; // can access protected values from different package thru inheritance
	//	obj.salary  - default values can not be accessed in a different package; it gives us an error; 
		obj.nameOfCompany ="Apple"; 
		obj.culture();
		EmployeeST.work();
		//obj.test is not available because it is default
	}
	
	

}
