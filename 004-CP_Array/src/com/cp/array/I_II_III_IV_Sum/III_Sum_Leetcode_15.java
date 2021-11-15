package com.cp.array.I_II_III_IV_Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class III_Sum_Leetcode_15 {

	public static void main(String[] args) {
		int[] input = new int[] { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> resList = threeSum(input);
		System.out.println(resList);
	}

	//Time Complexity: O(n^2 log n). log n time for sorting
	public static List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums); // log n
		Set<List<Integer>> set = new HashSet<>();
		int n = nums.length;
		for (int i = 0; i < n-2; i++) {
			int start = i+1, end = n - 1;
			while (start < end) {
				int sum = nums[start] + nums[end];
				if (sum == (-nums[i])) { // minus and plus of same number will be zero
					set.add(Arrays.asList(nums[i], nums[start], nums[end]));
					break;
				} else if (sum < -nums[i]) {
					start += 1;
				} else if (sum > -nums[i]) {
					end -= 1;
				}
			}
		}
		return new ArrayList<List<Integer>>(set);
	}
}
/*
 * Time Complexity: O(n^2 log n). log n time for sorting.
 * Inner while loop will take O(n) time, outer for loop will take O(n) time, sorting will take log n time.
 * */
