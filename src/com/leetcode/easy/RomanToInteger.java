package com.leetcode.easy;

public class RomanToInteger {
	
	public static void main(String[] args) {
		RomanToInteger r = new RomanToInteger();

		int answer = r.romanToInt("III");

		System.out.println(answer);

	}
	
	public final static int I = 1;
	public final static int V = 5;
	public final static int X = 10;
	public final static int L = 50;
	public final static int C = 100;
	public final static int D = 500;
	public final static int M = 1000;
	


	public int romanToInt(String s) {
		
		
		System.out.println();

		return 1;
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
