package com.simpleproblems;

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		middleNode(
				new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
	}

	public static ListNode middleNode(ListNode head) {

		ListNode copy = head;
		if (head == null || head.next == null) {
			return head;
		}

		int length = 0;
		while (copy != null) {
			copy = copy.next;
			length += 1;
		}

		for (int i = 0; i < length / 2; i++) {
			head = head.next;
		}

		return head;
	}
}
