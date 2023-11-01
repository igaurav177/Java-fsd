package com.binarysearch;

import java.util.Arrays;
public class BinarySearch {
	public static int binarySearch(int arr[], int target) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=(start+(end-start))/2;
			if(arr[mid]>target) {
				end=mid-1;
			}else if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {10,20,40,60,80};
		
		System.out.println(binarySearch(arr, 40));
 
	}

}
