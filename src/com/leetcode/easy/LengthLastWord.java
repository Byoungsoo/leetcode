package com.leetcode.easy;

public class LengthLastWord {

	public static void main(String[] args) {
		LengthLastWord l = new LengthLastWord();
		String s = "  Hello   world  ";
		int answer = l.lengthOfLastWord(s);

		System.out.println("The answer is " + answer);
	}

	public int lengthOfLastWord(String s) {
		char space = ' ';
		int cur = 0;
		int pre = 0;

		for (int i = 0; i < s.length(); i++) {
			if (space == s.charAt(i)) {
				if (cur != 0) {
					pre = cur;
				}
				cur = 0;
			} else {
				cur++;
			}
		}
		if (pre != 0 && cur == 0) {
			cur = pre;
		}
		return cur;
	}

}
