package com.leetcode.medium;

public class SearchRotatedSortedArray {

	public static void main(String[] args) {
		SearchRotatedSortedArray srsa = new SearchRotatedSortedArray();
		int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		int answer = srsa.search(nums, target);
		System.out.println("The answer is: " + answer);

	}

	public int search(int[] nums, int target) {

		int length = nums.length;
		String answer = "";

		for (int i = 0; i < length; i++) {
			if (target == nums[i]) {
				return i;
			} else {
				continue;
			}
		}

		if ("".equals(answer)) {
			answer = "-1";
		}

		return Integer.parseInt(answer);
	}

}
