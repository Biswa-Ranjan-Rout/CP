package com.cp.array.sliding_window_problems;

public class Find_Sum_In_Sum_Of_K_Conjucative_Elements_of_Array {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 5, 1 };
		int sum = 6;

		boolean result = find(arr, sum);
		System.out.println("Result: " + result);
	}

	private static boolean find(int[] arr, int sum) {
		int cur_sum = arr[0], start = 0;
		int n = arr.length;

		for (int i = 1; i <= n; i++) {//1
			while (cur_sum > sum) {
				cur_sum -= arr[start];
				start++;//1,

			}
			if (cur_sum == sum) {
				return true;
			}
			cur_sum += arr[i];//5
		}
		return false;
	}
}
