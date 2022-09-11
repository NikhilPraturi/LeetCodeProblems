package com.simpleproblems;

public class LinkedListCycleII {

	public static void main(String[] args) {
		ListNode listNode = new ListNode(-1);
		listNode.next = new ListNode(-7);
		listNode.next.next = new ListNode(7);
		listNode.next.next.next = new ListNode(-4);
		listNode.next.next.next.next = new ListNode(19);
		listNode.next.next.next.next.next = new ListNode(6);
		listNode.next.next.next.next.next.next = new ListNode(-9);
		listNode.next.next.next.next.next.next.next = new ListNode(-5);
		listNode.next.next.next.next.next.next.next.next = new ListNode(-2);
		listNode.next.next.next.next.next.next.next.next.next = new ListNode(-5);
		listNode.next.next.next.next.next.next.next.next.next.next = listNode.next.next.next.next.next;
		
		detectCycle(listNode);
	}
	
	public static ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode fast = head, slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				break;
			}
		}
		if (fast.next == null || fast == null) {
			return null;
		}
		fast = head;
		while (fast != slow) {
			fast = fast.next;
			slow = slow.next;

		}
		return fast;
	}

}
