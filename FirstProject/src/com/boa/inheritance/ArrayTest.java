package com.boa.inheritance;

class X{
	
	private int i;
	
	public X(int i) {
		
		super();
		this.i = i;
	}

	@Override
	public String toString() {
		return "X [i=" + i + "]";
	}
	
	
}

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {2,4,6,8};
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int x : a) {
			System.out.println(x);
		}
		
		X [] arr = new X[3];
		arr[0] = new X(5);
		arr[1] = new X(12);
		arr[2] = new X(8);
		
		for (X y : arr) {
			System.out.println(y);
		}
	}

}
