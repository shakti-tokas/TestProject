package com.boa.inheritance;

public class Person {

	private String name;
	private String gender;
	private int age;
	private Address address;
	
	public Person(String name, String gender, int age, Address address) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}
	
	public void print() {
		
		System.out.println(name+"\t"+gender+"\t"+age);
		address.print();
	}
}
