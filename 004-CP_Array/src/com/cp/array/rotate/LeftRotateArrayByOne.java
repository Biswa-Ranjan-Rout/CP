package com.cp.array.rotate;

public class LeftRotateArrayByOne {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 5, 6, 7 };

		leftRotate(arr);

		for (int n : arr) {
			System.out.print(" " + n);
		}
	}

	private static void leftRotate(int[] arr) {
		int first = arr[0];

		for (int i = 1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length - 1] = first;
	}
}
