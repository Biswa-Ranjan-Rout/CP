package com.cp.array.rotate;

public class LeftRotateArrayBy_K_times_Efficient_Approach2 {

	public static void leftRotate_K_times(int[] arr, int k) {

		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);
		reverse(arr, 0, arr.length - 1);

	}

	// Time complexity: O(n). No auxilary space used.
	public static void reverse(int[] arr, int left, int right) {

		while (left < right) {
			int temp = arr[right];
			arr[right--] = arr[left];
			arr[left++] = temp;
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
