package com.boa.training;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(1,4,2019);
		d1.print();
		
		Date d2 = new Date(31,3,2019);
		d2.print();
	}

}

class Date {
	
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year){
		
		super();
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public void print() {
		System.out.println(day+"/"+month+"/"+year);
	}
}
