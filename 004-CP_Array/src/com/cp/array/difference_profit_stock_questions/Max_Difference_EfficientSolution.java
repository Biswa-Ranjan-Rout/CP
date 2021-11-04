package com.cp.array.difference_profit_stock_questions;

public class Max_Difference_EfficientSolution {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 1, 10, 6, 4, 8, 1 };
		int res = findMaxDifference(arr);
		System.out.println(res);
	}

	// Efficient
	public static int findMaxDifference(int[] arr) {

		int min_So_Far = arr[0], max_diff = 0;

		for (int i = 1; i < arr.length; i++) {
			min_So_Far = Math.min(min_So_Far, arr[i]);
			max_diff = Math.max(max_diff, arr[i] - min_So_Far);
		}

		return max_diff;
	}
}

/*
 * - To find the max difference, we can subtract the res from the minimum element
 * 	 so far to the left.
 * - And after every iteration we should check if the current
 * 	 element is smaller than the minimum element (min_so_far) then, replace the
 * 	 minimum with the current element.
 */