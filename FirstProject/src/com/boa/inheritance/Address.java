package com.boa.inheritance;

public class Address {
	
	private int doorNo;
	private String street;
	private String location;
	private String city;
	
	public Address(int doorNo, String street, String location, String city) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.location = location;
		this.city = city;
	}
	
	public void print() {
		
		System.out.println(doorNo+","+street+"\n"+location+"\n"+city);
	}
}
