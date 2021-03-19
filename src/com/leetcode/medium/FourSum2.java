package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSum2 {

	public static void main(String[] args) {
		FourSum2 fs = new FourSum2();
//		int nums[] = { -3, -1, 0, 2, 4, 5 };
//		int nums[] = { 1, 0, -1, 0, -2, 2 };
//		int nums[] = { -2,-1,-1,1,1,2,2};
//		int nums[] = { -2, -1, 0, 0, 1, 2 };
//		int nums[] = { -3, -1, 0, 2, 4, 5 };
		int nums[] = { -3, -2, -1, 0, 0, 1, 2, 3 };
		int target = 0;
		List<List<Integer>> answer = new LinkedList<List<Integer>>();
		answer = fs.fourSum(nums, target);

		for (int left = 0; left < answer.size(); left++) {
			for (Integer list : answer.get(left)) {
				System.out.print(list + " ");
			}
			System.out.println();
		}
	}
//	중복제거만 완료 하면 됨 

	int length = 0;

	public List<List<Integer>> fourSum(int[] nums, int target) {
		length = nums.length;
		Arrays.sort(nums);
		return kSum(nums, target, 3, 0);
	}

	private ArrayList<List<Integer>> kSum(int[] nums, int target, int k, int index) {
		ArrayList<List<Integer>> answer = new ArrayList<List<Integer>>();

		if (length <= index) {
			return answer;
		}

		if (k == 2) {
			int left = index;
			int right = length - 1;

			while (left < right) {
				// find a pair
				if (nums[left] + nums[right] == target) {
					List<Integer> temp = new ArrayList<>();
					temp.add(nums[left]);
					temp.add(nums[right]);
					answer.add(temp);
										
					// skip duplication
					while (left < right && nums[left] == nums[left + 1])
						left++;
					while (left < right && nums[right - 1] == nums[right])
						right--;
					left++;
					right--;
					// move left bound
				} else if (nums[left] + nums[right] < target ) {
					left++;
					// move right bound
				} else {
					right--;
				}
			}
		}

		else {
			for (int left = index; left < length - k + 1; left++) {
				// use current number to reduce ksum into k-1sum
				ArrayList<List<Integer>> temp = kSum(nums, target - nums[left], k - 1, left + 1);
				if (temp != null) {
					// add previous results
					for (List<Integer> t : temp) {
						t.add(0, nums[left]);
					}
					answer.addAll(temp);
				}
				while (left < length - 1 && nums[left] == nums[left + 1]) {
					// skip duplicated numbers
					left++;
				}
			}
		}
		return answer;
	}
}
