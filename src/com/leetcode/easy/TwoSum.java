package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//	public static void main(String[] args) {
//		TwoSum sol = new TwoSum();
//		int nums[] = { 1, 5, 3, 4 };
//		int target = 7;
//		int answer[];
//		answer = sol.twoSum(nums, target);
//
//		for (int i = 0; i < answer.length; i++) {
//			System.out.print(answer[i] + " ");
//		}
//	}

	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}

		throw new IllegalArgumentException("No two sum solution");

	}
}
