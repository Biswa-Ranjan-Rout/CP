package com.cp.array.trappingRainWater;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 0, 1, 2, 5 };
		int res = storageCalculation(arr);
		System.out.println(res);
	}

	public static int storageCalculation(int[] arr) {
		int n = arr.length;
		int res = 0;

		int[] left_max = new int[n];
		left_max[0] = arr[0];

		int[] right_max = new int[n];
		right_max[n - 1] = arr[n - 1];

		for (int i = 1; i < n; i++) {
			left_max[i] = Math.max(left_max[i - 1], arr[i]);
		}
		for (int i = n - 2; i >= 0; i--) {
			right_max[i] = Math.max(right_max[i + 1], arr[i]);
		}

		for (int i = 0; i < n; i++) {
			res += Math.min(left_max[i], right_max[i]) - arr[i];
		}

		return res;
	}
}
//Time complexity is O(n). Space complexity is O(n).


/*
 * Get the max element to left and max element to right of every element. Then
 * take min from both of them and subtract the current element.
 */
