package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

//	public static void main(String[] args) {
//		RomanToInteger r = new RomanToInteger();
//
//		int answer = r.romanToInt("MCMXCIV");
//
//		System.out.println(answer);
//
//	}

	public int romanToInt(String s) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int answer = 0;
//		while (s.length() > 0) {
//			
//			if (s.length() == 1) {
//				return answer += map.get(s);
//			}
//			if (map.get(s.substring(0, 1)) >= map.get(s.substring(1, 2))) {
//				answer += map.get(s.substring(0, 1));
//				s = s.substring(1);
//			} else {
//				answer += map.get(s.substring(1, 2)) - map.get(s.substring(0, 1));
//				s = s.substring(2);
//			}
//		}

		for (int i = 0; i < s.length() - 1; i++) {
			if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
				answer += map.get(s.charAt(i));
			} else {
				answer -= map.get(s.charAt(i));
			}
		}
		answer += map.get(s.charAt(s.length() - 1));
		return answer;
	}

}

/*
 * Input: s = "III" Output: 3
 * 
 * Input: s = "IV" Output: 4
 * 
 * Input: s = "IX" Output: 9
 * 
 * Input: s = "LVIII" Output: 58 Explanation: L = 50, V= 5, III = 3.
 * 
 * Input: s = "MCMXCIV" Output: 1994 Explanation: M = 1000, CM = 900, XC = 90
 * and IV = 4.
 * 
 * I 1 V 5 X 10 L 50 C 100 D 500 M 1000
 * 
 * 
 */
