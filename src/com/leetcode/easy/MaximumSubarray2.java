package com.leetcode.easy;

public class MaximumSubarray2 {

	public static void main(String[] args) {

//		int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int nums[] = { -2, -1 };
		MaximumSubarray2 ms = new MaximumSubarray2();
		int answer = ms.maxSubArray(nums);

		System.out.println(answer);
	}

	public int maxSubArray(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int max = Integer.MIN_VALUE;
		int curSum = 0;

		for (int i = 0; i < nums.length; i++) {
			curSum += nums[i];
			if (curSum >= max) {
				max = curSum;
			}
			if (curSum < 0) {
				curSum = 0;
			}
		}
		return max;
	}
}
