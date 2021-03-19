package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {

		int[] nums = { -1, -1, 0, 2 };
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
		

		if (nums.length < 3) {
			return answer;
		}

		Arrays.sort(nums);
		int length = nums.length;
		int sum;
		int left;
		int right;

		for (int i = 0; i < length - 1; i++) {
			left = i + 1;
			right = length - 1;
			if (i != 0 && nums[i - 1] == nums[i]) {
				continue;
			}
			while (left < right) {
				if(nums[i] > 0) return answer;
				
				sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					List<Integer> temp = new ArrayList<Integer>();
					temp.add(nums[i]);
					temp.add(nums[left]);
					temp.add(nums[right]);
					answer.add(temp);
					left++;
					while ((left < right) && (nums[left] == nums[left - 1]))
						left++;// avoid duplicates

					right--;
					while ((left < right) && (nums[right] == nums[right + 1]))
						right--;// avoid duplicates

				} else if (sum < 0) {
					left++;
				} else if (sum > 0) {
					right--;
				}
			}
		}

		return answer;
	}

}
