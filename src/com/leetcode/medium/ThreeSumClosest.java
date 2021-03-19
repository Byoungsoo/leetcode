package com.leetcode.medium;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {

		ThreeSumClosest tsc = new ThreeSumClosest();
		int[] nums = { 0, 1, 1, 1 };
		int target = -100;

		int answer = tsc.threeSumClosest(nums, target);
		System.out.println();
		System.out.println("The answer: " + answer);
	}

	public int threeSumClosest(int[] nums, int target) {

		int length = nums.length;

		Arrays.sort(nums);
		int left;
		int right;
		int sum = 0;
		int gap = Integer.MAX_VALUE;

		int answer = 0;

		for (int i = 0; i < length - 2; i++) {

			left = i + 1;
			right = length - 1;

			while (left < right) {
				sum = nums[i] + nums[left] + nums[right];

				if (sum == target) {
					return target;
				} else if (sum < target) {
					left++;
				} else if (sum > target) {
					right--;
				}

				if (gap > Math.abs(target - sum)) {
					gap = Math.abs(target - sum);
					answer = sum;
				}
			}

		}
		return answer;
	}

}
