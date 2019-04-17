package com.classesAndMethods;

public class TestAllScrum {

	// testing all testscrum
	public static void main(String[] args) {

		System.out.println("----Creating Employee Object------");
		EmployeeST emp = new EmployeeST();
		// accessing static variable .... we do not need an object, cause it is static
		System.out.println(EmployeeST.department);
		// access the static thru the class name EmployeeST.work(); in our case
		EmployeeST.work();
		emp.salary = 90000;
		emp.getPaid();

		System.out.println("-----Creating Scrum Team Object-----");

		ScrumTeam st = new ScrumTeam();
		// cause it extends to EmployeeSt
		ScrumTeam.work();
		// grand father features
		st.salary = 100000;
		st.getPaid();
		// my own features
		st.artifacts = "Product Backlog,Sprint Backlog,BurnDown Chart";
		st.ceremonies = "Sprint grooming,Sprint planning,Daily Stand ups, Sprint Demo";
		st.attendScrumMeetings();
		st.workOnArtifacts();

		System.out.println("---Creating Dev Object-----");

		DevTeam dev = new DevTeam();
		// cause it extents to ScrumTeam, which extends to EmployeeSt.....
		DevTeam.work();
		dev.salary = 180000;
		dev.getPaid();
		dev.artifacts = "Spring backlog";
		dev.ceremonies = "Sprint grooming,Sprint planning,Daily Stand ups, Sprint Demo";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();

		System.out.println("---Creating Front End Dev Object---");

		FrontEnd fe = new FrontEnd();

		FrontEnd.work();
		fe.salary = 180000;
		fe.getPaid();
		fe.artifacts = "Spring backlog";
		fe.ceremonies = "Sprint grooming,Sprint planning,Daily Stand ups, Sprint Demo";
		fe.workOnArtifacts();
		fe.attendScrumMeetings();
		fe.doFrontCoding();

		System.out.println("----Back End Dev Object-----");

		BackEnd be = new BackEnd();
		be.salary = 180000;
		be.getPaid();
		be.artifacts = "Spring backlog";
		be.ceremonies = "Sprint grooming,Sprint planning,Daily Stand ups, Sprint Demo";
		be.workOnArtifacts();
		be.attendScrumMeetings();
		be.doBackEnd();

		System.out.println("---Creating Tester Team-----");

		Tester qa = new Tester();
		qa.salary = 140000;
		qa.getPaid();
		qa.artifacts = "Spring backlog";
		qa.ceremonies = "Sprint grooming,Sprint planning,Daily Stand ups, Sprint Demo";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();

		System.out.println("---Creating Manual Testing-----");

		ManualTesting mt = new ManualTesting();
		mt.salary = 140000;
		mt.getPaid();
		mt.artifacts = "Spring backlog";
		mt.ceremonies = "Sprint grooming,Sprint planning,Daily Stand ups, Sprint Demo";
		mt.workOnArtifacts();
		mt.attendScrumMeetings();
		mt.doManualTesting();

		System.out.println("---Creating Automation Testing Object----");

		AutomationTesting at = new AutomationTesting();
		at.salary = 140000;
		at.getPaid();
		at.artifacts = "Spring backlog";
		at.ceremonies = "Sprint grooming,Sprint planning,Daily Stand ups, Sprint Demo";
		at.workOnArtifacts();
		at.attendScrumMeetings();
		at.doAutomationTesting();

		System.out.println("---Creating BA Object-----");

		BusinessAnalyst ba = new BusinessAnalyst();
		ba.salary = 110000;
		ba.getPaid();
		ba.artifacts = "Spring backlog";
		ba.ceremonies = "Sprint grooming,Sprint planning,Daily Stand ups, Sprint Demo";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();

		System.out.println("---Creating Scrum Master-----");

		ScrumMaster sm = new ScrumMaster();
		sm.salary = 150000;
		sm.getPaid();
		sm.artifacts = "Spring backlog";
		sm.ceremonies = "Sprint grooming,Sprint planning,Daily Stand ups, Sprint Demo";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.leadScrumMeetings();

		System.out.println("---Creating Product Owner-----");

		ProductOwner po = new ProductOwner();
		po.salary = 200000;
		po.getPaid();
		po.artifacts = "Spring backlog";
		po.ceremonies = "Sprint grooming,Sprint planning,Daily Stand ups, Sprint Demo";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.priorizeBackLog();
		po.talkToTheClient();

	}

}
