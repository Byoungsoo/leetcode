package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

	public static void main(String[] args) {
		LongestSubstring ls = new LongestSubstring();
		String s = "dabcfdf";

		int answer = ls.lengthOfLongestSubstring1(s);
		System.out.println(answer);

	}

	public int lengthOfLongestSubstring(String s) {

		if ("".equals(s)) {
			return 0;
		}

		int count = 0;
		int sIndex = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				count = 0;
				i = map.get(s.charAt(i));
				map.clear();
			} else {
				map.put(s.charAt(i), i);
				count++;
			}
			if (count > max) {
				max = count;
			}
		}
		return max;
	}
	public int lengthOfLongestSubstring1(String s) {
		int startIndex = 0;
		int maxLength = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int endIndex = 0; endIndex < s.length(); endIndex++) {
			Character current = s.charAt(endIndex);
			if (map.containsKey(current)) {
				startIndex = Math.max(map.get(current), startIndex);
			}
			maxLength = Math.max(maxLength, endIndex - startIndex + 1);
			map.put(current, endIndex + 1);
		}
		return maxLength;
	}
}
