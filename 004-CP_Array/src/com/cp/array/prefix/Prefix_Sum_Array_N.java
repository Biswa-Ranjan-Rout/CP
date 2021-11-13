package com.cp.array.prefix;

public class Prefix_Sum_Array_N {
	
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

	public static int getSum(int[] arr, int left, int right) {
		int sum = 0;

		for (int i = left; i <= right; i++) {
			sum += arr[i];
		}
		return sum;
	}
}

// Time complexity: O(n)
// Space Complexity: O(1)
// We can solve this in O(1), i.e for the first operation it'll take O(n), then it'll calculate O(1) time.
