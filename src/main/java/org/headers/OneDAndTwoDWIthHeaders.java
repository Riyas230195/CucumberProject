package org.headers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OneDAndTwoDWIthHeaders {
	
	public static void main(String[] args) {
		
		//1D with Header
		Map<String,String> m = new LinkedHashMap<String,String>();
		
		m.put("Name", "Riyas");
		m.put("Age", "28");
		m.put("Course", "Java");
		
		String s = m.get("Name");
		System.out.println(s);
		
		
		//2D with Header
		
		
		List<LinkedHashMap<String,String>> m1 = new ArrayList<LinkedHashMap<String,String>>();
		//adding inner map first
		LinkedHashMap<String,String> a1 = new LinkedHashMap<String,String>();
		
		a1.put("Name", "Riyas");
		a1.put("Age", "28");
		a1.put("Course", "Java");
		
		
        LinkedHashMap<String,String> a2 = new LinkedHashMap<String,String>();
		
		a2.put("Name", "Abi");
		a2.put("Age", "30");
		a2.put("Course", "Sql");
		
		
        LinkedHashMap<String,String> a3 = new LinkedHashMap<String,String>();
		
		a3.put("Name", "Vijay");
		a3.put("Age", "45");
		a3.put("Course", "Selenium");
		
		
		m1.add(a1);
		m1.add(a2);
		m1.add(a3);
		
		
		LinkedHashMap<String, String> c = m1.get(1);
		String string = c.get("Name");
		System.out.println(string);
		
		
		
		
		
	}

}
