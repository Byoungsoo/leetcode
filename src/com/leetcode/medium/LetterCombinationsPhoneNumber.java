package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumber {
	static Map<String, String> map;

	public static void main(String[] args) {

		LetterCombinationsPhoneNumber lcpn = new LetterCombinationsPhoneNumber();
		List<String> answer = new ArrayList<String>();
		map = new HashMap<String, String>();
		map.put("a", "2");
		map.put("b", "2");
		map.put("c", "2");
		map.put("d", "3");
		map.put("e", "3");
		map.put("f", "3");
		map.put("g", "4");
		map.put("h", "4");
		map.put("i", "4");
		map.put("j", "5");
		map.put("k", "5");
		map.put("l", "5");
		map.put("m", "6");
		map.put("n", "6");
		map.put("o", "6");
		map.put("p", "7");
		map.put("q", "7");
		map.put("r", "7");
		map.put("s", "7");
		map.put("t", "8");
		map.put("u", "8");
		map.put("v", "8");
		map.put("w", "9");
		map.put("x", "9");
		map.put("y", "9");
		map.put("z", "9");

		String digits = "23";
		answer = lcpn.letterCombinations(digits);

		for (String string : answer) {
			System.out.print(string + "  ");
		}

	}

	public List<String> letterCombinations(String digits) {
		List<String> list = new ArrayList<String>();

		if (digits.length() == 0 || digits.length() > 4) {
			return list;
		}
		int length = digits.length();
		int count = 0;

		for (int i = 0; i < length; i++) {
			for (String string : map.keySet()) {
				if (map.get(string).equals(digits.substring(i, i + 1))) {
					
					
					string = list.get(count) + string;
					list.add(count, string);
					count++;
				}
			}
			count = 0;
		}
		
		
		for (String string : list) {
			System.out.print(string + " ");
		}

		return list;
	}
}
