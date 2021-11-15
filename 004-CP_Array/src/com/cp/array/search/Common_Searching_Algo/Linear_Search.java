package com.cp.array.search.Common_Searching_Algo;

public class Linear_Search {

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
		
		long startTime = System.nanoTime();
		int index = search(arr, 9);
		long endTime = System.nanoTime();

		System.out.println("Found At Index: " + index + "		,Time Taken: " + (endTime - startTime));
	}

	// Time Complexity: O(n).
	public static int search(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

}
