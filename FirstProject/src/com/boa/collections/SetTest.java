package com.boa.collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(25);
		set.add(12);
		set.add(25);
		set.add(12);
		set.add(23);
		
		System.out.println(set);

	}

}
