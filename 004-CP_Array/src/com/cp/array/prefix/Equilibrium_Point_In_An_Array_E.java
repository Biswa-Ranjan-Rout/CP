package com.cp.array.prefix;

// With Prefix algorithm solution
public class Equilibrium_Point_In_An_Array_E {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 6, 4, 0, -1 };
		int res = checkForEquilibrium(arr);
		System.out.println("res: " + res);
	}

	// Time Complexity: O(n)
	// Space: O(n)
	public static int checkForEquilibrium(int[] arr) {
		int n = arr.length;
		int total_sum = 0;
		int[] left_sum_arr = new int[n];
		left_sum_arr[0] = arr[0];

		// 1st calculate the total sum
		for (int i = 0; i < n; i++) {
			total_sum += arr[i];
		}
		
		int left_sum = 0;
		int right_sum = 0;
		// Then, calculate left sum and right sum. And check if equals
		for (int i = 1; i < n; i++) {
			
			left_sum_arr[i] = left_sum_arr[i - 1] + arr[i];
			
			left_sum = left_sum_arr[i] - arr[i];
			right_sum = total_sum - left_sum_arr[i];

			if (left_sum == right_sum) {
				return i;
			}
		}
		return -1;
	}
}

// https://www.youtube.com/watch?v=c9imv2LvgWk&ab_channel=TECHDOSE

/*


  for(i = 1 to n){
  	if(l_sum == r_sum){
  		return true;
  	}
  }
  
  
 */