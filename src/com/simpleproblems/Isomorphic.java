package com.simpleproblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 205. Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters 
may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true
 

Constraints:
1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
Accepted
614,932
Submissions
1,449,006
f->b
o->a
baa
bar



 */
public class Isomorphic {
	public static void main(String[] args) {
		isIsomorphic("foo", "bar");
//		isIsomorphic("badc", "baba");
//		isIsomorphic("egg", "add");
		
		/*
		 * [f]->b, [b]->f
		 * [o]->a, [a]->o
		 * [o]->a
		 * 
		 */

	}

	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char sarray[] = new char[256];
		char tarray[] = new char[256];
		char sval,tval;
		for (int i = 0; i < s.length(); i++) {
			sval = s.charAt(i);
			tval = t.charAt(i);
			if(sarray[sval] == 0 && tarray[tval] == 0) {
				sarray[sval] = tval;
				tarray[tval] = sval;
			} else if(sarray[sval] != tval) {
				return false;
			}
		}
		return true;
	}

}
