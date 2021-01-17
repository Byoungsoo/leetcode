package com.leetcode.easy;

public class Palindrome2 {

	/*
	 * public static void main(String[] args) { int x = 123321; boolean answer = new
	 * Palindrome2().isPalindrome(x); System.out.println("The answer is " + answer);
	 * }
	 */

	public boolean isPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}

		int rev = 0;
		while (x > rev) {
			rev = rev * 10 + x % 10;
			x = x / 10;
		}
		return (rev == x || rev / 10 == x);
	}

}
