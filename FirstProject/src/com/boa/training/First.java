package com.boa.training;

public class First {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome");
		
		Employee emp = new Employee();
		emp.assignValues(450, "Raj", "SSE");
		
		Employee emp2 = new Employee();
		emp2.assignValues(550, "Shyam", "SSE");
		
		Employee emp3 = new Employee(650, "Mohan", "SSE");
		
		emp.printValues();
		emp2.printValues();
		emp3.printValues();
	}

}
