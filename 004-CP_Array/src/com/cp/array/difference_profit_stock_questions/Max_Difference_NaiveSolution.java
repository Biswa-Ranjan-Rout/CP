package com.cp.array.difference_profit_stock_questions;

// Find maximum difference between two elements 
public class Max_Difference_NaiveSolution {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 10, 6, 4, 8, 1 };
		int res = findMaxDifference(arr);
		System.out.println(res);
	}

	// Not Efficient
	public static int findMaxDifference(int[] arr) {
		int max = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ( (arr[j] - arr[i]) > max) {
					max = arr[j] - arr[i];
				}
			}
		}
		return max;
	}
}
