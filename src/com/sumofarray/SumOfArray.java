package com.sumofarray;

public class SumOfArray {
	static int sumOfArrayElement(int[] arr, int left, int right) {
		int sum=0;
		if(left>=0 && right<arr.length) {
			for(int i=left;i<=right;i++) {
				sum += arr[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int sum=sumOfArrayElement(arr, 0, 3);
		System.out.println("sum of array between given range is : "+sum);
	}

}
