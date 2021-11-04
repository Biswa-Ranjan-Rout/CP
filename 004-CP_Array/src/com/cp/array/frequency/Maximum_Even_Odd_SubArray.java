package com.cp.array.frequency;

public class Maximum_Even_Odd_SubArray {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 12, 10 };
		// int[] nums = new int[] { 0, 0, 0, 0 };
		int res = countMax(nums);
		System.out.println(res);
	}

	private static int countMax(int[] nums) {
		int count = 0, max_cnt = 0;

		for (int i = 1; i < nums.length; i++) {
			if (((nums[i - 1] % 2 == 0) && (nums[i] % 2 != 0)) 
					|| ((nums[i - 1] % 2 != 0) && (nums[i] % 2 == 0))) {
				count += 1;
				max_cnt = Math.max(max_cnt, count);
			} else {
				count = 0;
			}
		}
		return max_cnt + 1;
	}
}
