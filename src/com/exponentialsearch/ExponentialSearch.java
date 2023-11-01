package com.exponentialsearch;

import java.util.Arrays;
public class ExponentialSearch {
    public static int exponentialSearch(int[] arr ,int length, int value ){
    	
    	if(arr.length<1 || arr.length != length) {
    		return -1;
    	}
    	
    if(arr[0]==value){
        return 0;
        }
    int i=1;
    while(i<length && arr[i]<=value){

        i=i*2;
    }
    return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
    }


    public static void main(String[] args) {
    	int arr[] = {10,20,40,60,80};
		System.out.println(exponentialSearch(arr, 5,40));
	}

}
