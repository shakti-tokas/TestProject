package com.boa.inheritance;

class Utility {
	
	void travel(Flyer f) {
		f.fly();
	}
}

public class InterfaceTestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird br = new Bird();
		Utility util = new Utility();
		
		util.travel(br);
		
		//Example of anonymous class
		//Class created on the fly to implement interface method
		Flyer fr = new Flyer() {
			
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("Flyer flying..");
			}
		};
		
		util.travel(fr);
		
		//above can also be done like this
		util.travel(new Flyer() {
			
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("Flyer anonymously flying..");
			}
		});
	}

}
