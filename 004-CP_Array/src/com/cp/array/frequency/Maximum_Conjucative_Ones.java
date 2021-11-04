package com.cp.array.frequency;

public class Maximum_Conjucative_Ones {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 20, 1, 1, 12, 1, 1, 1, 4 };
		// int[] arr = new int[] { 1, 1, 1, 1 };
		// int[] arr = new int[] { 0,0,0};

		maxConjucativeOne(arr);
	}

	public static void maxConjucativeOne(int[] arr) {
		int max_cnt = 0;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				cnt += 1;
				if (cnt > max_cnt) {
					max_cnt = cnt;
				}
			} else {
				cnt = 0;
			}
		}
		System.out.println(max_cnt);
	}
}
