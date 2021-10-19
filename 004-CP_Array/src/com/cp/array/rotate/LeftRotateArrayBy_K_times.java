package com.cp.array.rotate;

public class LeftRotateArrayBy_K_times {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 5, 6, 7 };
		int k = 3;
		
		for (int i = 0; i < k; i++) {
			leftRotate_K_times(arr);
		}

		for (int n : arr) {
			System.out.print(" " + n);
		}
	}

	private static void leftRotate_K_times(int[] arr) {
		int first = arr[0];

		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = first;
	}

}
