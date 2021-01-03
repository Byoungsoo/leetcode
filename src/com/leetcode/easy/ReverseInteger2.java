package com.leetcode.easy;

public class ReverseInteger2 {

	public int reverse(int x) {

		int answer = 0;
		int pop = 0;

		if (x == 0) {
			return 0;
		}

		try {
			while (x != 0) {
				pop = x % 10;
				x = x / 10;

				if (answer > Integer.MAX_VALUE / 10 || (answer == Integer.MAX_VALUE / 10 && pop > 7)) {
					return 0;
				}

				if (answer < Integer.MIN_VALUE / 10 || (answer == Integer.MIN_VALUE / 10 && pop < -8)) {
					return 0;
				}

				answer = (answer * 10) + pop;

			}

		} catch (Exception e) {
			return 0;
		}

		return answer;

	}
}
