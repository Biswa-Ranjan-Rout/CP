package com.cp.array.sorting;

public class MoveZeroToEndOfArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 9, 2, 0, 3, 0, 5, 0, 6, 7 };

		// moveZeroToLast(arr);
		moveZero(arr);

		for (int n : arr) {
			System.out.print(" " + n);
		}
	}

	// Naive Approach. Time complexity is O(n ^ 2) 
	public static void moveZeroToLast(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				for (int j = i + 1; j < n; j++) {
					if (arr[j] != 0) {
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
						
						i++; // This will maintain the order
					}
				}
			}
		}
	}

	// Efficient Approach. Time complexity: O(n)
	public static void moveZero(int[] arr) {
		int n = arr.length;
		int count = 0; // Number of non-zero element

		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;

				count += 1;
			}
		}
	}
}


