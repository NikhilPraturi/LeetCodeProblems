package com.simpleproblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
		reverseList(new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4,new ListNode(5))))));
	}
	
//    public static ListNode reverseList(ListNode head) {
//    	
//    	if(head == null) {
//    		return head;
//    	}
//    	ListNode reverse =  null;
//    	ListNode res = null;
//    	List<Integer> l = new ArrayList<>();
//    	while(head != null) {
//    		l.add(head.val);
//    		head = head.next;
//    	}
//    	reverse = new ListNode(l.get(l.size()-1));
//    	res = reverse;
//    	for (int i = l.size()-2; i >= 0; i--) {
//    		reverse.next = new ListNode(l.get(i));
//    		reverse = reverse.next;
// 		}
//		return res;
//    }
	
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;//next = 2
			head.next = prev;//1
			prev = head;//1
			head = next;//2
		}
		return prev;
	}
}
