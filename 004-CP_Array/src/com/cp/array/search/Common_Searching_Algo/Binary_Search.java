package com.cp.array.search.Common_Searching_Algo;

import java.util.Arrays;

public class Binary_Search {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4,
				0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1,
				2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4,
				0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1,
				2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4,
				0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1,
				2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4,
				0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 1,
				2, 6, 4, 0, -1, 1, 2, 6, 4, 0, -1, 9 };

		// To use binary search, the array must be a sorted.
		Arrays.sort(arr);

		long startTime = System.nanoTime();
		int index = b_search(arr, 9);
		long endTime = System.nanoTime();

		System.out.println("Found At Index: " + index + "		,Time Taken: " + (endTime - startTime));
	}

	//	Note: To use binary search, the array must be a sorted.

	/*
	 * Time Complexity: O(log n). As the input is divided by 2 each time means input
	 * is reducing to half of current size in each iteration. Thats why time
	 * complexity is O(log n)
	 */
	private static int b_search(int[] arr, int ele) {
		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (ele == mid) {
				return mid;
			} else if (ele < mid) {
				high = mid - 1;
			} else if (ele > mid) {
				low = mid + 1;
			}
		}
		return -1;
	}

}
