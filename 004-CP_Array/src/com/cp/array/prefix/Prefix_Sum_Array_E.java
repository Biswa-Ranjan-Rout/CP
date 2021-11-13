package com.cp.array.prefix;

public class Prefix_Sum_Array_E {
	public static void main(String[] args) {
		int[] arr = new int[] { 4, 10, 2, 16, 70 };

		int res = getSum(arr, 0, 2);
		System.out.println("Sum: " + res);

		int res2 = getSum(arr, 1, 3);
		System.out.println("Sum: " + res2);

		int res3 = getSum(arr, 1, 4);
		System.out.println("Sum: " + res3);

		int res4 = getSum(arr, 0, 4);
		System.out.println("Sum: " + res4);
		
		int res5 = getSum(arr, 4, 4);
		System.out.println("Sum: " + res5);
	}

	private static int getSum(int[] arr, int left, int right) {

		int[] sum_arr = make_sumArray(arr);
		
		if (left != 0) {
			return sum_arr[right] - sum_arr[left - 1];
		}
		else {
			return sum_arr[right]; 
		}

	}

	// Auxiliary method or helper method
	public static int[] make_sumArray(int[] arr) {

		int[] sum_arr = new int[arr.length];
		sum_arr[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			sum_arr[i] = sum_arr[i - 1] + arr[i];
		}
		return sum_arr;
	}
}
