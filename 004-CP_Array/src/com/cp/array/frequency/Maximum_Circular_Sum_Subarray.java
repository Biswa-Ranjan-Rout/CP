package com.cp.array.frequency;

public class Maximum_Circular_Sum_Subarray {

	public static void main(String[] args) {
		int[] nums = new int[] { 3, -1, 2, -1 };
		int res = max_circular_sum(nums);
		System.out.println("Max Circular Sum: " + res);
	}

	public static int max_circular_sum(int[] nums) {
		int max_sum = max_sum(nums);

		int total_sum = 0;
		for (int i = 0; i < nums.length; i++) {
			total_sum += nums[i];
			nums[i] = -nums[i];
		}
		int circular_max_sum = total_sum - (-max_sum(nums));

		return Math.max(max_sum, circular_max_sum);
	}

	public static int max_sum(int[] nums) {
		int max_sum = nums[0], sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			max_sum = Math.max(max_sum, sum);

			if (sum < 0)
				sum = 0;
		}
		return max_sum;
	}
}

/*
 *  1. First we are finding the maximum sum sub array
 * 2. Then, we are finding the total sum of entire array
 * 3. Then, we are finding the minimum sum sub-array (to do this we are changing the 
 * 	  sign of every element in the array)
 * 4. Then, to find the circular max sum, we are subtracting the minimum sum sub array from total sum.
 * 5. As we have changed the sign of element to find minimum sum sub-array, we are using - sign 
 * 	  to change the sign again as it was earlier.
 * 6. After getting the circular sum, we are returning the maximum between circular_max_sum and max_sum.
 * 
 * */
