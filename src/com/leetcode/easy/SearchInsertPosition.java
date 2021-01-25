package com.leetcode.easy;

public class SearchInsertPosition {

//	public static void main(String[] args) {
//
//		SearchInsertPosition s = new SearchInsertPosition();
//		int nums[] = { 1, 3, 5, 6 };
//		int target = 7;
//
//		int answer = s.searchInsert(nums, target);
//		System.out.println("The answer is " + answer);
//
//	}

	public int searchInsert(int[] nums, int target) {
		if (nums[nums.length - 1] < target) {
			return nums.length;
		}
		if (nums[0] >= target) {
			return 0;
		}

		for (int i = 0; i < nums.length; i++) {
			if (target <= nums[i]) {
				return i;
			}
		}
		return 0;
	}
}
