package com.leetcode.medium;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
		String s = "bb";
		String answer = lps.longestPalindrome(s);
		System.out.println("answer: " + answer);

	}

	int leftIndex, maxLen;

	public String longestPalindrome(String s) {

		int len = s.length();
		if (len < 2)
			return s;
				
		for (int i = 0; i < len - 1; i++) {
			extendPalindrome(s, i, i);
			extendPalindrome(s, i, i + 1);
		}
		return s.substring(leftIndex, leftIndex + maxLen);

	}

	public void extendPalindrome(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}

		if (maxLen < right - left - 1) {
			leftIndex = left + 1;
			maxLen = right - left - 1;
		}
	}

}
