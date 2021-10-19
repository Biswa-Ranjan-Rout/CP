package com.cp.array.rotate;

public class LeftRotateArrayBy_K_times_Efficient_Approach1 {

	// Time complexity is: O( k + (n-k) + k ) = O(n)
	private static void leftRotate_K_times(int[] arr, int k) {

		int[] temp = new int[k];
		int n = arr.length;

		for (int i = 0; i < k; i++) {
			temp[i] = arr[i];
		}

		for (int i = k; i < n; i++) {
			arr[i - k] = arr[i];
		}

		for (int i = 0; i < k; i++) {
			arr[n - k + i] = temp[i];
		}
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 5, 6, 7 };
		int k = 3;

		leftRotate_K_times(arr, k);

		for (int n : arr) {
			System.out.print(" " + n);
		}
	}

}
