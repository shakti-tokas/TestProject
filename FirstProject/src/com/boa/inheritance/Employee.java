package com.boa.inheritance;

public class Employee extends Person {

	private int empId;
	private String designation;
	
	public Employee(String name, String gender, int age, Address address, int empId, String designation) {
		super(name, gender, age, address);
		this.empId = empId;
		this.designation = designation;
	}
	
	public void print() {
		
		System.out.println(empId+"\t"+designation);
		super.print();
	}
}
