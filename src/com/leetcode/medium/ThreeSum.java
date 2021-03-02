package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {

	public static void main(String[] args) {

		int[] nums = { -1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4 };
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		ThreeSum ts = new ThreeSum();
		list = ts.threeSum(nums);

		for (List<Integer> list2 : list) {
			for (int answer : list2) {
				System.out.print(answer + " ");
			}
			System.out.println();
		}

	}

	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> answer = new ArrayList<List<Integer>>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {

						List<Integer> list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						answer.add(list);
					}
				}
			}
		}

		return answer;
	}

}
