package com.hcl.Java8StreamDemo

import java.util.stream

public class Java8StreamDemo {

	public static void main(String[] args) {
		
		empList.stream().filter((s) -> s.startsWith("B"))
	    empList.stream().filter((s) -> s.startsWith("D"))
        .forEach(System.out::println);
		
		empList.stream().filter(p -> (p.getSalary() > 1000)).forEach(p -> System.out.println(p.getSalary()));
		
		empList.stream().filter(p -> (p.getAge() > 30)).forEach(p -> System.out.println(p.getName()));

	}

}
