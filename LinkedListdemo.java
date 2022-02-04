package com.hcl.LinkedListdemo;

import java.util.LinkedList;

public class LinkedListdemo {

	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<String>();
		countries.add("India");
		countries.add("China");
		countries.add("Russia");
		countries.add("UK");
		countries.add("USA");

		System.out.println(countries.getLast());

	}

}
