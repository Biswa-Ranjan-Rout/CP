package com.cp.array.flips;

public class Minimum_Consecutive_Flips_To_Make_Same {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0 };

		flip(nums);
	}

	private static void flip(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				if (nums[i] != nums[0]) {
					nums[i] = nums[0];
				}
			}
			System.out.print(nums[i]+" ");
		}
	}
}
