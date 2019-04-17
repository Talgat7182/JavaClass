package com.classesAndMethods;
// our child extends Parent
public class ScrumTeam extends EmployeeST{
	
	public  String artifacts; 
	public String ceremonies; 
	
	
	public void attendScrumMeetings() {
		
		System.out.println("Scrum team attend "+ ceremonies);
	}
	
	public void workOnArtifacts() {
		System.out.println("Scrum team work on "+ artifacts);
	}
	
	
	
	

}
