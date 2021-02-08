package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

//	public static void main(String[] args) {
//		LongestSubstring ls = new LongestSubstring();
//		String s = "abba";
//
//		int answer = ls.lengthOfLongestSubstring(s);
//		System.out.println(answer);
//
//	}

	public int lengthOfLongestSubstring(String s) {

		if ("".equals(s)) {
			return 0;
		}

		int sIndex = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < s.length(); i++) {

			if (map.containsKey(s.charAt(i))) {
				if (map.get(s.charAt(i)) > sIndex)
					sIndex = map.get(s.charAt(i));
			}
			if (i - sIndex + 1 > max) {
				max = i - sIndex + 1;
			}
			map.put(s.charAt(i), i + 1);
		}
		return max;
	}
}
