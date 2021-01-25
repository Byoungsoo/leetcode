package com.leetcode.easy;

import java.util.NoSuchElementException;
import java.util.Stack;

public class ValidParentheses {

//	public static void main(String[] args) {
//		ValidParentheses v = new ValidParentheses();
//		String s = "(])";
//		boolean answer = v.isValid(s);
//		System.out.println("The answer is " + answer);
//
//	}

	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();
		char ch = ' ';
		boolean answer = true;

		if (s.length() <= 1 || s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
			return false;
		}

		try {
			for (int i = 0; i < s.length(); i++) {
				ch = s.charAt(i);
				if (ch == '(' || ch == '[' || ch == '{') {
					stack.add(ch);
				} else if (ch == ')' && stack.lastElement() == '(') {
					stack.pop();
				} else if (ch == ']' && stack.lastElement() == '[') {
					stack.pop();
				} else if (ch == '}' && stack.lastElement() == '{') {
					stack.pop();
				} else {
					return false;
				}
			}
			if (stack.size() > 0) {
				answer = false;
			}

		} catch (NoSuchElementException e) {
			return false;
		}

		return answer;
	}

}
