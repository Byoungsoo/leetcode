package com.leetcode.medium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContainerMostWater {

	public static void main(String[] args) {

		ContainerMostWater cmw = new ContainerMostWater();
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		int answer = cmw.maxArea(height);
		System.out.println("The answer is: " + answer);
	}

	public int maxArea(int[] height) {
		int w = 0;
		int h = 0;
		int max = 0;

		for (int i = height.length - 1; i > 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				w = i - j;
				h = height[i] >= height[j] ? height[j] : height[i];
				if (max < w * h) {
					max = w * h;
				}
			}
		}

		return max;
	}

}