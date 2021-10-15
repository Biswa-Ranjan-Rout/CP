package com.cp.numbers;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
		
		int res = reverse(2147483647);
		//int res = reverse(214);
		System.out.println(" Reverse: " + res);
	}

	private static int reverse(int num) {
		
		int upper_value = Integer.MAX_VALUE / 10;
		int lower_value = Integer.MIN_VALUE / 10;
		
		int res = 0;
		while (num != 0) {
			
			if(res > upper_value || res < lower_value) {
				return 0;
			}
			int rem = num % 10;
			num = num / 10;

			res = (res * 10) + rem;
		}

		return res;
	}
}
