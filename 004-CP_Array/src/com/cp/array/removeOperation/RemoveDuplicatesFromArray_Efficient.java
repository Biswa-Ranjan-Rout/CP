package com.cp.array.removeOperation;

public class RemoveDuplicatesFromArray_Efficient {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 2, 3, 8, 8, 5, 7, 4 };
		int[] rev = removeDuplicates(arr);

		for (int i : rev) {
			System.out.print(i + " ");
		}
	}

	// Time complexity: O(n). Without using auxiliary array
	public static int[] removeDuplicates(int[] arr) {

		int j = arr.length - 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == arr[i]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j--] = temp;
			}
		}

		return arr;
	}

}

/*
 * As we can't delete elements from array in java, we are just moving those
 * duplicates to last part of the array. Otherwise we can replace then with 0 or -1.
 * 
 */