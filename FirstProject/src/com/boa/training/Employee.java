package com.boa.training;

public class Employee {
	
	private int empId;
	private String empName;
	private String designation;
	
	public Employee(){}
	
	public Employee(int id, String eName, String dsgn) {
		
		empId = id;
		empName = eName;
		designation = dsgn;
	}
	
	public void assignValues(int id, String eName, String dsgn) {
		
		empId = id;
		empName = eName;
		designation = dsgn;
	}
	
	public void printValues() {
		System.out.println("Emplyee Id: "+ empId);
		System.out.println("Emplyee Name: "+ empName);
		System.out.println("Emplyee Desg: "+ designation);
	}

}
