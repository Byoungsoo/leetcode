package com.leetcode.easy;

public class MaximumSubarray {

	public static void main(String[] args) {

//		int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int nums[] = { 1, 1, 2, -1 };
		MaximumSubarray ms = new MaximumSubarray();
		int answer = ms.maxSubArray(nums);

		System.out.println(answer);
	}

	public int maxSubArray(int[] nums) {
		int numSize = nums.length;
		if (nums.length == 1) {
			return nums[0];
		}

		int sum = 0;
		int count = 0;
		int result[] = new int[numSize * (numSize + 1) / 2];

		for (int k = 0; k < nums.length; k++) {
			for (int i = 0; i < nums.length - k; i++) {
				sum = 0;
				for (int j = i; j < k + i + 1; j++) {
					sum += nums[j];
					if (j == nums.length - 1) {
						break;
					}
				}
				result[count] = sum;
				sum = 0;
				count++;
			}
		}
		int max = result[0];
		for (int i = 0; i < result.length; i++) {
			if (result[i] >= max) {
				max = result[i];
			}
		}
		return max;
	}
}
