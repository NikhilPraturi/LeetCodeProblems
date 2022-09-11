package com.simpleproblems;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestPalindrome {
	
	public static void main(String[] args) {
		longestPalindrome("abccccdd");
	}

//	public static int longestPalindrome(String s) {
//
//		Set<Character> set = new HashSet<>();
//		int len = 0;
//		for (Character c : s.toCharArray()) {
//			if (set.contains(c)) {
//				len += 2;
//				set.remove(c);
//			} else {
//				set.add(c);
//			}
//		}
//		return set.size() > 0 ? len + 1: len;
//	}
	
	public static int longestPalindrome(String s) {
		int[] x = new int[256]; 
		for (Character c : s.toCharArray()) {
			x[c]++;
		}
		int res = 0;
 		for (int i = 0; i < x.length; i++) {
			res += x[i]/2 * 2;
			if(res % 2 == 0 && x[i] % 2 == 1) {
				res += 1;
			}
		}
		return 0;
	}
}
