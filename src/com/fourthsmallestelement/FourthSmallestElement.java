package com.fourthsmallestelement;

import java.util.Arrays;

public class FourthSmallestElement {
	 public static int findFourthSmallest(int[] arr) {
	        if (arr.length < 4) {
	            System.out.println("Array doesn't have a fourth smallest element.");
	            return -1;
	        }

	        int[] sortedArr = Arrays.copyOf(arr, arr.length);
	        Arrays.sort(sortedArr);

	        return sortedArr[3];
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, 4, 9, 10, 25, 2, 24, 6, 19};
	        int fourthSmallest = findFourthSmallest(arr);

	        if (fourthSmallest != -1) {
	            System.out.println("The gfourth smallest element is: " + fourthSmallest);
	        }
	    }
}
