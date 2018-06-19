package com.app.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		String[] array = {"aa", "bb", "cc"};
		List<String> list = Arrays.asList(array);
		list.add("dd");
		
		List<String> list2 = new ArrayList<>();
		list2.add("aa");
		list2.add("aa");
		list2.add("aa");
		
		Object[] array2 = list2.toArray();
	}

}
