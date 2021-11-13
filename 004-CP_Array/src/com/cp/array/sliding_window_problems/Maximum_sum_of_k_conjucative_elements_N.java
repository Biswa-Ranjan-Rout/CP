package com.cp.array.sliding_window_problems;

/* 
 	Given an array of integers and number k, find the maximum sum of k conjugative elements.
 *  */
public class Maximum_sum_of_k_conjucative_elements_N {

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 4, 5, 0, 5, 7, 9, 1, 5, 9, 9, 9, 1, 3, 2 };
		int k = 3;
		int res = k_maxSum(nums, k);
		System.out.println("max sum: " + res);
	}

	private static int k_maxSum(int[] nums, int k) {
		int max_sum = 0;

		for (int i = 0; i < nums.length - k; i++) { // Runs from 0 to length - k
			int cur_sum = 0;
			for (int j = i; j < i + k; j++) { // Runs from current i to next 3 position (i.e -> i + k)
				cur_sum += nums[j];
			}
			max_sum = Math.max(max_sum, cur_sum);
		}
		return max_sum;
	}

}
