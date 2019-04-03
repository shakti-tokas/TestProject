package com.boa.training;

class Pair<T>{
	private T first;
	private T second;
	
	public Pair(T first, T second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}
	
}

class NextPair<T1,T2>{
	private T1 first;
	private T2 second;
	
	public NextPair(T1 first, T2 second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	@Override
	public String toString() {
		return "NextPair [first=" + first + ", second=" + second + "]";
	}
	
}

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String> ps = new Pair<String>("Mohan", "Sharma");
		
		Pair<Integer> pi = new Pair<Integer>(23, 45);
		
		System.out.println(ps);
		System.out.println(pi);
		
		NextPair<Integer,String> np = new NextPair<Integer, String>(50, "Ram");
		
		NextPair<Integer,Employee> ne = new NextPair<Integer, Employee>(50, new Employee(550,"John","SE"));
		
		System.out.println(np);
		System.out.println(ne);

	}

}
