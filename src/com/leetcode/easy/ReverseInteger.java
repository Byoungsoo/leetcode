package com.leetcode.easy;

public class ReverseInteger {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ReverseInteger sol = new ReverseInteger();
//
//		int x = 1123124;
//		int answer = sol.reverse(x);
//
//		System.out.print("answer: " + answer);
//
//	}

	public int reverse(int x) {

//		step1: Positive or Negative: Add Minus or Not
//		step2: When X value is negative then change X to Absolute Value
		Boolean postivie = true;
		Boolean firstDigit = true;
		int answer;

		if (x == 0) {
			return 0;
		} else if (x > 0) {
			postivie = true;
		} else if (x < 0) {
			postivie = false;
			x = Math.abs(x);
		}

//		step3: Change Integer X to String
		String strX = String.valueOf(x);
		String changeX = "";

		if (!postivie) {
			changeX += "-";
		}

//		step4: Change last digit to first digit
//		step5: Check Zero number of first digit in loop and delete
		try {
			for (int i = strX.length() - 1; i >= 0; i--) {
				if (!firstDigit || strX.charAt(i) != '0') {
					changeX += strX.charAt(i);
					firstDigit = false;
				}
			}
			answer = Integer.parseInt(changeX);
		} catch (Exception e) {
			return 0;
		}

		return answer;

	}
}
