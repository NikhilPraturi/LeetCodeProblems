package com.simpleproblems;

import java.util.Iterator;
import java.util.Stack;

public class ValidParanthesis {

	public boolean isValid(String s) {
		Stack<Character> store = new Stack<>();
		if (s.length() == 1 || s.isEmpty() || s.length() % 2 != 0)
			return false;
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (x == '{' || x == '[' || x == '(') {
				store.push(s.charAt(i));
				continue;
			}
			if (store.size() > 0) {
				char check;
				if (x == ')') {
					check = store.pop();
					if (check != '(') {
						return false;
					}
				} else if (x == '}') {
					check = store.pop();
					if (check != '{') {
						return false;
					}

				} else if (x == ']') {
					check = store.pop();
					if (check != '[') {
						return false;
					}
				}
			} else {
				return false;
			}
		}
		return store.isEmpty();
	}
}
