package com.java;

public class CountEvenOdd {

	public static void main(String[] args) {
		// Count Number Of EVEN & ODD Digits in A Number

		int[] nums = {1,2,3,4,5,6,7};
		int even=0;
		int odd=0;
		
		for(int num : nums) {
			if(num%2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even num count:" + even);
		System.out.println("Odd num count:" + odd);

	}

}


//Even num count:3
//Odd num count:4