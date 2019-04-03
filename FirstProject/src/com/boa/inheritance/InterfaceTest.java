package com.boa.inheritance;

interface Feedable{
	void eat();
}

interface Flyer{
	void fly();
}

class Bird implements Feedable, Flyer {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Bird flying");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Bird eating");
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird br = new Bird();
		br.fly();
		br.eat();
		System.out.println(br instanceof Feedable);
		System.out.println(br instanceof Flyer);
		
		Feedable fd = new Bird();
		fd.eat();
		System.out.println(fd instanceof Feedable);
		System.out.println(fd instanceof Flyer);
		
		Flyer fr = (Flyer)fd;
		fr.fly();
		
	}

}
