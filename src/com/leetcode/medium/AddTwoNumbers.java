package com.leetcode.medium;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int arr1[] = { 9, 9, 9, 9, 9, 9, 9 };
		int arr2[] = { 9, 9, 9, 9 };
		ListNode answer = new ListNode();
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

		AddTwoNumbers adn = new AddTwoNumbers();
		answer = adn.addTwoNumbers(l1, l2);

		while (answer != null) {
			System.out.print(answer.val + " - ");
			answer = answer.next;
		}

	}

//	  Definition for singly-linked list.
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

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode answer = null;
		ListNode cur = new ListNode();

		int carry = 0;

		while (l1 != null || l2 != null) {

			if (l1 == null) {
				l1 = new ListNode(0);
			}
			if (l2 == null) {
				l2 = new ListNode(0);
			}

			if (l1.val + l2.val + carry >= 10) {
				ListNode temp = new ListNode(l1.val + l2.val + carry - 10);
				cur.next = temp;
				cur = temp;
				carry = 1;
			} else {
				ListNode temp = new ListNode(l1.val + l2.val + carry);
				cur.next = temp;
				cur = temp;
				carry = 0;
			}
			if (answer == null) {
				answer = cur;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		if (carry == 1) {
			ListNode temp = new ListNode(1);
			cur.next = temp;
		}

		return answer;
	}

}
