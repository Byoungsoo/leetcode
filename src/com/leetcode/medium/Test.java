package com.leetcode.medium;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		
		LinkedList<String> test = new LinkedList<String>();
		
		test.add("a");
		test.add("b");
		test.add("c");
					
		int length = test.size();
		for (int i = 0; i < length; i++) {
			System.out.println(test.peek());
		}
		
		test.push("d");
		test.push("e");
		test.push("f");
		
		length = test.size();
		for (int i = 0; i < length; i++) {
			System.out.println(test.pop());
		}
		
		
		

	}

}
