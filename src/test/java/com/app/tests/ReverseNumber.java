package com.app.tests;

import java.util.Arrays;

public class ReverseNumber {

	public static void main(String[] args) {
		
		//Reverse int without transfer to string
		int num = 54321;
		int reverse = 0;

		while(num != 0){
			reverse = reverse * 10 + (num % 10);
			num = num / 10; 
		}
		
		System.out.println(num + " "+ reverse);

//		Reminder find the last number 
//			12345 % 10 = 1234 bc 5 cant reminder with 10

		int[] num1 = new int[]{1,2,3,4,5,6};

		for (int i = 0; i < (num1.length)/2; i++){
			int temp = 0;
			temp = num1[i];
			num1[i] = num1[num1.length-1-i];
			num1[num1.length-1-i] = temp;
		}
		
		System.out.println(Arrays.toString(num1));
		
	}
}
