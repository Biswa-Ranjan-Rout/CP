package com.cp.array.search;

public class FindTheLargestElementInArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 60, 0, 99, 18, -4, 24, 1 };
		int res = findLargest(arr);
		System.out.println("Largest element is: " + res);
	}

	private static int findLargest(int[] arr) {

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}

// Time complexity: O(n)