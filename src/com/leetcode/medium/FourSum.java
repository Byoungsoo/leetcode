package com.leetcode.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		FourSum fs = new FourSum();
//		int nums[] = { -3, -1, 0, 2, 4, 5 };
		int nums[] = { 1, 0, -1, 0, -2, 2 };
//		int nums[] = { -2,-1,-1,1,1,2,2};
//		int nums[] = { -2, -1, 0, 0, 1, 2 };
//		int nums[] = { -3, -1, 0, 2, 4, 5 };
		int target = 2;
		List<List<Integer>> answer = new LinkedList<List<Integer>>();
		answer = fs.fourSum(nums, target);

		for (int i = 0; i < answer.size(); i++) {
			for (Integer list : answer.get(i)) {
				System.out.print(list + " ");
			}
			System.out.println();
		}

	}
//	중복제거만 완료 하면 됨 

	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> answer = new LinkedList<List<Integer>>();
		int left = 0;
		int right = nums.length - 1;
		int originTarget = target;
		int leftSub;
		int rightSub;

		Arrays.sort(nums);

		while (right - left > 2) {
			leftSub = left + 1;
			rightSub = right - 1;
			target = originTarget - nums[left] - nums[right];

			while (leftSub < rightSub) {
				List<Integer> temp = new LinkedList<Integer>();
				if (nums[leftSub] + nums[rightSub] == target) {
					temp.add(nums[left]);
					temp.add(nums[leftSub]);
					temp.add(nums[right]);
					temp.add(nums[rightSub]);
					answer.add(temp);
					leftSub++;
					if (nums[leftSub] == nums[leftSub - 1]) {
						leftSub++;
					} else if (nums[rightSub] == nums[rightSub - 1]) {
						rightSub--;
					}
				} else if (nums[leftSub] + nums[rightSub] < target) {
					leftSub++;
				} else if (nums[leftSub] + nums[rightSub] > target) {
					rightSub--;
				}
			}


		}

		return answer;
	}

}
