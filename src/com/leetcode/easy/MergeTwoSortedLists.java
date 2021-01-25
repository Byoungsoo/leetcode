package com.leetcode.easy;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		MergeTwoSortedLists m = new MergeTwoSortedLists();
		ListNode answer = new ListNode();

		int arr1[] = {};
		int arr2[] = {};
		ListNode l1 = new ListNode();
		ListNode l2 = new ListNode();

		for (int i = arr1.length - 1; i >= 0; i--) {
			if (i == arr1.length - 1) {
				ListNode temp = new ListNode(arr1[i]);
				l1 = temp;
			} else {
				ListNode temp = new ListNode(arr1[i]);
				temp.next = l1;
				l1 = temp;
			}
		}
		for (int i = arr2.length - 1; i >= 0; i--) {
			if (i == arr2.length - 1) {
				ListNode temp = new ListNode(arr2[i]);
				l2 = temp;
			} else {
				ListNode temp = new ListNode(arr2[i]);
				temp.next = l2;
				l2 = temp;
			}
		}

		answer = m.mergeTwoLists(l1, l2);
		for (int i = 0; i < 1; i++) {
			System.out.println("List Node: " + answer.val);
			answer = answer.next;
		}

	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode answer = null;
		ListNode temp = null;
		ListNode pointer = new ListNode();

		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		} else if (l1 == null && l2 == null) {
			return null;
		}

		while (l1 != null && l2 != null) {
			if (l1.val >= l2.val) {
				temp = new ListNode(l2.val);
				pointer.next = temp;
				pointer = temp;

				if (l2.next != null) {
					l2.val = l2.next.val;
					l2.next = l2.next.next;
				} else {
					l2 = null;
					pointer.next = l1;
				}
			} else {
				temp = new ListNode(l1.val);
				pointer.next = temp;
				pointer = temp;
				if (l1.next != null) {
					l1.val = l1.next.val;
					l1.next = l1.next.next;
				} else {
					l1 = null;
					pointer.next = l2;
				}
			}

			if (answer == null) {
				answer = temp;
			}
		}

		return answer;
	}

}
