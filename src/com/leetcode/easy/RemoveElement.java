package com.leetcode.easy;

public class RemoveElement {

//	public static void main(String[] args) {
//		RemoveElement r = new RemoveElement();
//		int nums[] = { 0,1,2,2,3,0,4,2 };
//		int val = 2;
//		int len = r.removeElement(nums, val);
//		System.out.println("The answer is " + len);
//	}

	public int removeElement(int[] nums, int val) {
		if (nums.length == 0)
			return 0;

		int c = nums.length;
		if (nums[nums.length - 1] == val) {
			c--;
		}

		for (int i = 0; i < c; i++) {
			if (val == nums[i]) {
				c--;
				for (int j = i; j < nums.length - 1; j++) {
					nums[j] = nums[j + 1];
				}
				i--;
			}
		}
		
		return c;
	}
}
