package com.simpleproblems;

public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {

		StringBuffer values = new StringBuffer("");
		StringBuffer index = new StringBuffer("");
		for (int i = 0; i < nums.length; i++) {
			if (!values.toString().contains(String.valueOf("[" + nums[i] + "]"))) {
				values.append("[" + nums[i] + "]");
				index.append("[" + i + "]");
			}
		}
		int pos = 0;
		for (int i = 0; i < nums.length; i++) {
			if (index.toString().contains(String.valueOf("[" + i + "]"))) {
				nums[pos] = nums[i];
				pos++;
			}
		}
		return pos;
	}
}
