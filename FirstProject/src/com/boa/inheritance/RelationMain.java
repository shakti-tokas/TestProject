package com.boa.inheritance;

public class RelationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address add = new Address(8, "MG Road", "Park Centra", "GGM");
		//Person per = new Person("Mohan", "M", 21, add);
		Employee emp = new Employee("Mohan", "M", 21, add, 650, "SSE");
		
		emp.print();
	}

}
