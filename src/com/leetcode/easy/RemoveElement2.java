package com.leetcode.easy;

public class RemoveElement2 {

//	public static void main(String[] args) {
//		RemoveElement2 r = new RemoveElement2();
//		int nums[] = { 0,1,2,2,3,0,4,2 };
//		int val = 2;
//		int len = r.removeElement(nums, val);
//		System.out.println("The answer is " + len);
//	}

	 public int removeElement(int[] nums, int val) {
	        int i=0;
	        for(int value:nums){
	        	System.out.println("value: " + value + "   val: " + val);
	            if(value!=val){
	                nums[i]=value;
	                i++;
	            }
	        }
	        return i;
	    }
}
