package com.simpleproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedList {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode sort = l1;
		ListNode temp = null;
		if (l1 == null && l2 == null) {
			return l1;
		} else if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}

		while (l1 != null) {
			if (l1.next == null) {
				l1.next = l2;
				break;
			}
			l1 = l1.next;
		}

		List<Integer> list = new ArrayList<>();

		while (sort != null) {
			list.add(sort.val);
			sort = sort.next;
		}
		Collections.sort(list);
		temp = new ListNode(list.get(0));
		ListNode next = temp;
		for (int i = 1; i < list.size(); i++) {
			if (temp.next == null) {
				temp.next = new ListNode(list.get(i));
				temp = temp.next;
			}
		}
		return next;
	}
}

class ListNode {
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
