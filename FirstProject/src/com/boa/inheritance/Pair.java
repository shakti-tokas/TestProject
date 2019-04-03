package com.boa.inheritance;

public class Pair {
	
	private int first;
	private int second;
	
	public Pair(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "object of type pair"+first+"and"+second+super.toString();
	}
	
	
}
