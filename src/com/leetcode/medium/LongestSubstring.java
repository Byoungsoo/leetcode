package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

	public static void main(String[] args) {
		LongestSubstring ls = new LongestSubstring();
		String s = "dvdf";

		int answer = ls.lengthOfLongestSubstring(s);
		System.out.println(answer);

	}

	public int lengthOfLongestSubstring(String s) {

		if ("".equals(s)) {
			return 0;
		}

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int max = Integer.MIN_VALUE;
		
		return max;
	}
}
