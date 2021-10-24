package com.cp.array.difference;

public class Max_Difference_EfficientSolution {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 10, 6, 4, 8, 1 };
		int res = findMaxDifference(arr);
		System.out.println(res);
	}

	// Efficient
	public static int findMaxDifference(int[] arr) {

		int min_So_Far = arr[0], res = arr[1] - arr[0];

		for (int i = 1; i < arr.length; i++) {
			res = Math.max(res, arr[i] - min_So_Far);
			min_So_Far = Math.min(min_So_Far, arr[i]);
		}

		return res;
	}
}

/*
 * To find the max difference, we can subtract the res from the minimum element
 * so far to the left. And after every iteration we should check if the current
 * element is smaller than the minimum element (min_so_far) then, replace the
 * minimum with the current element
 */