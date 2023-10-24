package com.array;

public class ArrayExample {

	public static void main(String[] args) {

		//single-dimensional array
		int arr[]= {100,200,300,400,500};
		for(int i=0;i<5;i++) {
			System.out.println("Elements of array a: "+arr[i]);
		}


		//multidimensional array
		int[][] multiArr = {
				{5, 3, 9, 10}, 
				{10, 5, 7,1} };

		System.out.println("\nLength of row 1: " + multiArr[0].length);
	}

}
