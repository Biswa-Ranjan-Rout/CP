package com.cp.array.removeOperation;

public class RemoveDuplicatesFromArray_Naive {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 2, 3, 8, 8, 5, 7, 4 };
		int[] rev = removeDuplicates(arr);

		for (int i : rev) {
			System.out.print(i + " ");
		}
	}

	// Time complexity: O(n). Using auxiliary array
	public static int[] removeDuplicates(int[] arr) {
		int[] temp = new int[arr.length];
		temp[0] = arr[0];
		int res = 1;

		for (int i = 1; i < arr.length; i++) {
			if (temp[res - 1] != arr[i]) {
				temp[res++] = arr[i];
			}
		}
		return temp;
	}
}
