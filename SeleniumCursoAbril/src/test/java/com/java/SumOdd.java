package com.java;

public class SumOdd {

	public static boolean isOdd(int number) {
		if(number<0) {
			return false;
		}
		
		if(number % 2 != 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int sumOdd(int start, int end) {
		if(start>end || start<=0|| end<=0){
			return -1;
		}
		
		int sum = 0;
		for(int i = start; i <= end ; i++) {
			if(isOdd(i)) {
//				sum=sum+i;
				sum+=i;
			}
		}
		return sum;
	}
}
