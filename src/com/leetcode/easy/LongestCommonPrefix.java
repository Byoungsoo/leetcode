package com.leetcode.easy;

public class LongestCommonPrefix {

//	public static void main(String[] args) {
//
//		String[] strs = { "reflower", "flow", "flight" };
//		LongestCommonPrefix l = new LongestCommonPrefix();
//		String answer = l.longestCommonPrefix(strs);
//
//		System.out.println("The Answer is: " + answer);
//	}

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		} else if (strs.length == 1) {
			return strs[0];
		}

		int size = strs[0].length();
		int min = 0;
		for (int i = 0; i < strs.length; i++) {
			if (size >= strs[i].length()) {
				size = strs[i].length();
				min = i;
			}
		}
		boolean flag = false;

		while (flag == false) {
			for (int i = 0; i < strs.length; i++) {
				if (min == i) {
					continue;
				}
				if (!strs[i].substring(0, strs[min].length()).equals(strs[min])) {
					flag = false;
					strs[min] = strs[min].substring(0, strs[min].length() - 1);
					break;
				} else {
					flag = true;
				}
			}
			if (strs[min].length() == 0) {
				return "";
			}
		}
		return strs[min];
	}

}

/*
 * Example 1:
 * 
 * Input: strs = ["flower","flow","flight"] Output: "fl" Example 2:
 * 
 * Input: strs = ["dog","racecar","car"] Output: "" Explanation: There is no
 * common prefix among the input strings.
 */
