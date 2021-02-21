package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
		String s = "dabbad";
		String answer = lps.longestPalindrome(s);
		System.out.println("answer: " + answer);

	}

	public String longestPalindrome(String s) {

		int sIndex = 0;
		int eIndex = 0;
		int max = Integer.MIN_VALUE;
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		
		for (int i = 0; i < s.length(); i++) {
			Character cur = s.charAt(i);
			if (map.containsKey(cur)) {
				
			}
			else {
				map.put(cur, i);
			}
			
		}
		return s.substring(sIndex, eIndex);
	}

}
