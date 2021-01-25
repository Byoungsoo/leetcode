package com.leetcode.easy;

public class CountandSay {

	public static void main(String[] args) {
		CountandSay countandSay = new CountandSay();
		String result = countandSay.countAndSay(3);
		System.out.println("resut: " + result);
	}

	public String countAndSay(int n) {
		String answer = "";
		String result = "";
		String digit = "";
		int count = 0;
		boolean change = false;

		if (n == 1) {
			return "1";
		} else {
			answer = countAndSay(n - 1);
			for (int i = 0; i < answer.length(); i++) {
				if (digit != answer.substring(i, i + 1)) {
					result += String.valueOf(count) + digit;
					digit = answer.substring(i, i + 1);
				}
				if (digit == answer.substring(i, i + 1)) {
					count++;
				}
			}
		}

		return result;
	}

}
