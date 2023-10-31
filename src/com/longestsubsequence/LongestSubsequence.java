package com.longestsubsequence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class LongestSubsequence {
	public static List<Integer> findLongestSubsequence(int[] arr){
		int n=arr.length;
		int[] list = new int[n];
		Arrays.fill(list, 1);
		
		for(int i=1;i<n;i++) {
			 for (int j = 0; j < i; j++) {
	                if (arr[i] > arr[j] && list[i] < list[j] + 1) {
	                    list[i] = list[j] + 1;
	                }
	         }	            
		}
		int maxLength = Arrays.stream(list).max().orElse(0);
        List<Integer> result = new ArrayList<>();
        
        int lastIndex = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (list[i] == maxLength && (lastIndex == -1 || arr[i] < arr[lastIndex])) {
                result.add(arr[i]);
                maxLength--;
                lastIndex = i;
            }
            
        }
        Collections.reverse(result);
        
        return result;

	}

	public static void main(String[] args) {
		int arr[] = {12, 35, 23, 19, 45, 100};
		List<Integer> list = findLongestSubsequence(arr);
		System.out.println("Longest Increasing Subsequence list:\n"+list);

	}

}
