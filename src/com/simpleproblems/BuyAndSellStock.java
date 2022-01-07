package com.simpleproblems;

import java.util.Iterator;

/*
 * 121. Best Time to Buy and Sell Stock
Easy

12891

456

Add to List

Share
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 */
public class BuyAndSellStock {

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] { 7, 6, 4, 3, 1 }));
	}

	public static int maxProfit(int[] prices) {
		int min = prices[0], max = 0;
		for (int price : prices) {
			if (min > price) {
				min = price;
			}
			if (max < price - min) {
				max = price - min;
			}
		}
		return max;
	}
}
