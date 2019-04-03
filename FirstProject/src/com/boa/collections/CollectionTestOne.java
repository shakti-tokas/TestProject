package com.boa.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("orange");
		list.add("banana");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);

	}

}
