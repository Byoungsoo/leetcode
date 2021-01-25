package com.leetcode.easy;

public class ImplementStr {

//	public static void main(String[] args) {
//		ImplementStr s = new ImplementStr();
//		String haystack = "";
//		String needle = "";
//		int answer = s.strStr(haystack, needle);
//		System.out.println("The answer is " + answer);
//
//	}

	public int strStr(String haystack, String needle) {
		if (needle == "" || "".equals(needle)) {
			return 0;
		}
		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			if (needle.equals(haystack.substring(i, i + needle.length()))) {
				return i;
			}
		}

		return -1;
	}

}
