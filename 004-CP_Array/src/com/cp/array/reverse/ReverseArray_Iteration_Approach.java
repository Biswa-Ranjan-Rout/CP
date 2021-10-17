package com.cp.array.reverse;

public class ReverseArray_Iteration_Approach {

	public static void main(String[] args) {
		int[] arr = new int[] { 60, 0, 99, 8, 4, 24, 1 };
		reverse(arr);

		for (int e : arr) {
			System.out.print(" " + e);
		}
	}

	public static void reverse(int[] arr) {
		int low = 0, high = arr.length - 1;

		while (low < high) {
			int temp = arr[low];
			arr[low++] = arr[high];
			arr[high--] = temp;
		}
	}
}

// Time complexity : Theta(n) or O(n) 

/*
 * The while loop will run total n/2 times. so f(n) = n/2. If we'll ignore the
 * constant it's O(n).
 */

/*
 * Don't be confuse with log n. Because for log n, in every iteration loop
 * should reduce by n/2 times.
 */