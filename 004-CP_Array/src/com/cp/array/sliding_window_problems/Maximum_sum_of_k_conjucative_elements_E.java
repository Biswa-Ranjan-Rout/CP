package com.cp.array.sliding_window_problems;

public class Maximum_sum_of_k_conjucative_elements_E {

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 4, 5, 0, 5, 7, 9, 1, 5, 9, 9, 9, 1, 3, 2 };
		int k = 3;
		int res = k_maxSum(nums, k);
		System.out.println("max sum: " + res);
	}

	private static int k_maxSum(int[] nums, int k) {
		int max_sum = 0;
		int sum = 0;

		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}

		for (int i = k; i < nums.length; i++) {
			sum = sum - nums[i - k] + nums[i];
			max_sum = Math.max(max_sum, sum);
		}
		return max_sum;
	}
}
// GeeksForGeeks
