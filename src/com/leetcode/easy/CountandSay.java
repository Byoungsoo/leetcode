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
		char digit = ' ';
		boolean flag = false;
		int count = 0;

		if (n == 1) {
			return "1";
		} else {
			answer = countAndSay(n - 1);
			for (int i = 0; i < answer.length(); i++) {
				if (digit != answer.charAt(i)) {
					if (i != 0) {
						result += String.valueOf(count) + String.valueOf(digit);
						count = 0;
					}
					digit = answer.charAt(i);
				}
				if (digit == answer.charAt(i)) {
					count++;
				}

				if (i == answer.length() - 1) {
					flag = true;
				}
			}
			if (flag = true) {
				result += String.valueOf(count) + String.valueOf(digit);
				count = 0;
			}

		}

		return result;
	}

}
