package com.cp.array.prefix;

/* Equilibrium Point: If sum of all the elements is equal to sum of all the elements to right then,
 *  that index point is called equilibrium index point or equilibrium point.
 */

// Without Prefix algorithm solution
public class Equilibrium_Point_In_An_Array_N {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 6, 4, 0, -1 };
		int res = checkForEquilibrium(arr);
		System.out.println("res: " + res);
	}

	// Time Complexity: O(n^2)
	public static int checkForEquilibrium(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int left_sum = 0;
			int right_sum = 0;

			for (int j = 0; j < i; j++) {
				left_sum += arr[j];
			}
			for (int j = i + 1; j < n; j++) {
				right_sum += arr[j];
			}
			if (left_sum == right_sum) {
				return i;
			}
		}
		return -1;

	}

}
