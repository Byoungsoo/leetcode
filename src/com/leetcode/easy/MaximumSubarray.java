package com.leetcode.easy;

public class MaximumSubarray {

//	public static void main(String[] args) {
//
////		int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//		int nums[] = { 1, 1, 2, -1 };
//		MaximumSubarray ms = new MaximumSubarray();
//		int answer = ms.maxSubArray(nums);
//
//		System.out.println(answer);
//	}

	public int maxSubArray(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int result = Integer.MIN_VALUE;
		int sum = 0;
		int count = 0;

		for (int k = 0; k < nums.length; k++) {
			for (int i = 0; i < nums.length - k; i++) {
				sum = 0;
				for (int j = i; j < k + i + 1; j++) {
					sum += nums[j];
					if (j == nums.length - 1) {
						break;
					}
				}
				if (sum >= result) {
					result = sum;
				}
				sum = 0;
				count++;
			}
		}
		return result;
	}
}
