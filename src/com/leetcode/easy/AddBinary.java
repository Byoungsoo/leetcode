package com.leetcode.easy;

public class AddBinary {

	public static void main(String[] args) {

		AddBinary addBinary = new AddBinary();
		String a = "11";
		String b = "1";
		String answer = addBinary.addBinary(a, b);
		System.out.println(answer);

	}

	public String addBinary(String a, String b) {
		if ("00".equals(a + b)) {
			return "0";
		}
		StringBuilder sb = new StringBuilder();

		int aSize = a.length();
		int bSize = b.length();
		char temp = '0';
		if (aSize > bSize) {
			for (int i = 0; i < aSize - bSize; i++) {
				b = "0" + b;
			}
		} else {
			for (int i = 0; i < bSize - aSize; i++) {
				a = "0" + a;
			}
		}

		for (int i = a.length() - 1; i >= 0; i--) {
			if (a.charAt(i) == '1' && b.charAt(i) == '1') {
				if (temp == '0') {
					sb.append("0");
					temp = '1';
				} else if (temp == '1') {
					sb.append("1");
					temp = '1';
				}
			} else if (a.charAt(i) == '1' || b.charAt(i) == '1') {
				if (temp == '0') {
					sb.append("1");
					temp = '0';
				} else if (temp == '1') {
					sb.append("0");
					temp = '1';
				}
			} else if (a.charAt(i) == '0' && b.charAt(i) == '0') {
				if (temp == '0') {
					sb.append("0");
					temp = '0';
				} else if (temp == '1') {
					sb.append("1");
					temp = '0';
				}
			}
		}

		if (temp == '1') {
			sb.append("1");
		}

		return sb.reverse().toString();
	}

}
