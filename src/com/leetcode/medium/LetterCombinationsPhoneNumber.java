package com.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsPhoneNumber {

	public static void main(String[] args) {
		LetterCombinationsPhoneNumber lcpn = new LetterCombinationsPhoneNumber();
		List<String> answer = new ArrayList<String>();

		String digits = "23";

		answer = lcpn.letterCombinations(digits);
		for (String string : answer) {
			System.out.print(string + "  ");
		}
	}

	public List<String> letterCombinations(String digits) {

		LinkedList<String> answer = new LinkedList<String>();
		if (digits.isEmpty()) {
			return answer;
		}
		int length = digits.length();
		String[] phone = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		answer.add("");

		for (int i = 0; i < length; i++) {
			int x = Character.getNumericValue(digits.charAt(i));

			while (answer.peek().length() == i) {
				String t = answer.remove();
				for (char s : phone[x].toCharArray())
					answer.add(t + s);
			}
		}

		return answer;
	}
}
