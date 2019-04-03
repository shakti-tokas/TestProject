package com.boa.collections;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties props = new Properties();
		props.setProperty("city", "GGM");
		props.setProperty("state", "Haryana");
		props.setProperty("country", "India");
		
		System.out.println(props.getProperty("state"));
		
		try {
			FileOutputStream fout = new FileOutputStream("test.properties");
			props.store(fout, "testing property type map");
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
