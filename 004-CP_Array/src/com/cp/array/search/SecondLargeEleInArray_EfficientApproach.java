package com.cp.array.search;

public class SecondLargeEleInArray_EfficientApproach {
	public static void main(String[] args) {

		int[] arr = new int[] { 60, 0, 99, 8, 4, 24, 1 };
		// int[] arr = new int[] { 9,9,9,9 };

		int res = findSecondLargest(arr);
		System.out.println("Largest element is: " + res);
	}

	private static int findSecondLargest(int[] arr) {

		int max = 0;
		int sec_max = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				sec_max = max;
				max = arr[i];
			}
			else if (arr[i] != max) {
				if (sec_max == -1 || arr[i] > sec_max) {
					sec_max = arr[i];
				}
			}
		}
		return sec_max;
	}

}
/*
 * Time Complexity is O(n). In one iteration we can find here max and sec_max.
 * We are maintaining 2 pointers at time. If we are finding a new max then, we
 * are replacing sec_max with max and we are setting the new maximum element as
 * max.
 * 
 */
