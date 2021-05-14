package com.simpleproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {

		if (strs.length == 1) {
			return strs[0];
		}

		StringBuffer stringBuffer = new StringBuffer("");
		for (int i = 0; i < strs.length; i++) {
			if (i + 1 != strs.length) {
				compareTwoValues(strs[i], strs[i + 1], stringBuffer);
				stringBuffer.append(",");
			}
		}
		String[] split = stringBuffer.toString().split(",");
		String prefix = "";
		if (split.length == strs.length - 1) {
			Set<String> s = new HashSet<>(Arrays.asList(split));
			prefix = split.length > 0 ? split[0] : "";
			for (Iterator iterator = s.iterator(); iterator.hasNext();) {
				String val = (String) iterator.next();
				if (val.length() < prefix.length()) {
					prefix = val;
				}
			}
		}
		return prefix;
	}

	public static StringBuffer compareTwoValues(String x1, String x2, StringBuffer buffer) {

		char[] xChars = x1.length() >= x2.length() ? x2.toCharArray() : x1.toCharArray();
		String x1x2 = String.valueOf(xChars).equals(x1) ? x2 : x1;
		boolean prefixMatch = false;
		for (int i = 0; i < xChars.length; i++) {
			boolean check = x1x2.charAt(i) == xChars[i];
			if (x1x2.charAt(i) == xChars[i] && i == 0 && check) {
				buffer.append(xChars[i]);
				prefixMatch = true;
			} else if (prefixMatch && i != 0 && check) {
				buffer.append(xChars[i]);
			} else {
				break;
			}
		}
		return buffer;
	}

	public static void main(String[] args) {
		String xy[] = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(xy));
	}
}
