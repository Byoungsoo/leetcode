package com.leetcode.easy;

public class RemoveDuplicates {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		RemoveDuplicates r = new RemoveDuplicates();
//		int nums[] = { 1, 2, 2, 3 };
//		int answer = r.removeDuplicates(nums);
//		System.out.println("\nThe answer is " + answer);
//
//	}

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}

		return i + 1;
	}

}
