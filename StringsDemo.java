package com.hcl.StringsDemo;

import java.util.StringTokenizer;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Christopher";
		String middleName = "S";
		String lastName = "Reyes";
		String dateofBirth = "01/01/01";

		System.out.println("First Name: " + firstName);
		System.out.println("Middle Name: " + middleName);
		System.out.println("Last Name: " + lastName);
		System.out.println("DOB: " + dateofBirth);
		
		System.out.print("String Tokenizer:\n");
		StringTokenizer split = new StringTokenizer("Christopher_S_Reyes", "_");
		while(split.hasMoreTokens()) {
			system.out.println.(splitString.nextElement());
		}
	}

}
