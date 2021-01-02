package com.leetcode;

import com.leetcode.easy.TwoSum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum sol = new TwoSum();
		int nums[] = { 1, 5, 3, 4};
		int target = 7;
		int answer[];
		answer = sol.twoSum(nums, target);
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}

}