package org.headers;

import java.util.ArrayList;
import java.util.List;

public class OneDAndTwoDWithoutHeader {

	public static void main(String[] args) {
		
		
		//1D without Header
		
		//adding details in list
		List<String> li=new ArrayList<String>();

		li.add("abi");
		li.add("abiammu28@gmail.com");
		li.add("java");
		
		
		
		String string = li.get(1);
		System.out.println(string);
		
	
		//2D without Header

	List<ArrayList<String>> li1=new ArrayList<ArrayList<String>>();
	
	// adding inner list first
        ArrayList<String> a1=new ArrayList<String>();

         a1.add("abinaya");
         a1.add("abinaya28@gmail.com");
         a1.add("selenium");

	
       ArrayList<String> a2=new ArrayList<String>();

          a2.add("abinayamridhu");
          a2.add("abinaya2829@gmail.com");
          a2.add("python");

       ArrayList<String> a3=new ArrayList<String>();

         a3.add("riyas");
         a3.add("riyas12@gmail.com");
         a3.add("sql");
   
     //adding outer list    

	     li1.add(a1);
	     li1.add(a2);
	     li1.add(a3);
	
	   ArrayList<String> arrayList = li1.get(2);
	   String string2 = arrayList.get(1);
	   System.out.println(string2);
	
	
	
	
	
	
	
	}
	
}




