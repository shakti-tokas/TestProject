package com.boa.collections;

import java.util.HashMap;
import java.util.Map;

import com.boa.inheritance.Address;
import com.boa.training.Employee;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "apple");
		map.put(2, "orange");
		map.put(3, "grape");
		
		System.out.println(map);
		
		System.out.println(map.get(3));
		
		Map<Address, Employee> map2 = new HashMap<Address, Employee>();
		map2.put(new Address(11,"mg road","sector","GGM"), new Employee(550,"Sanjay","SSE"));
		
		System.out.println(map2);
	}

}
