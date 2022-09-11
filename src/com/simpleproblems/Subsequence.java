package com.simpleproblems;

public class Subsequence {
	public static void main(String[] args) {
		isSubsequence("ab","baab");
	}

	public static boolean isSubsequence(String s, String t) {
		int sindex = 0;
		String subseq = ""; 
		for (int i = 0; i < t.length(); i++) {
			if(sindex == s.length()) {
				if(subseq.equals(s)) {
					return true;
				}
				return false;
			}
			if(t.charAt(i) == s.charAt(sindex)) {
				subseq+=t.charAt(i);
				sindex++;
			}
		}
		if(subseq.equals(s)) {
			return true;
		}
		return false;
	}
}
