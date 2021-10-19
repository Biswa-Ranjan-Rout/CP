package com.cp.array.sorting;

public class CHeck_If_Array_Is_Sorted {
	public static void main(String[] args) {
		// int[] arr = new int[] { 60, 0, 99, 8, 4, 24, 1 };

		int[] arr = new int[] { 1, 2, 3, 5, 6, 7 };

		boolean res = checkSorting(arr);
		System.out.println("Sorted: " + res);
	}

	private static boolean checkSorting(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] < arr[i]) {
				return false;
			}
		}
		return true;
	}

}

/*
 * Time complexity : O(n)
 * 
 * In a sorted array all the next index element will be either greater or equal
 * to the current index element.
 */