package com.quicksort;


import java.util.Arrays;

class QuickSort {


	static int partition(int array[], int low, int high) {


		int pivot = array[high];


		int i = (low - 1);


		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}

		}


		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;


		return (i + 1);
	}

	static void quickSort(int array[], int low, int high) {
		if (low < high) {


			int pi = partition(array, low, high);


			quickSort(array, low, pi - 1);


			quickSort(array, pi + 1, high);
		}
	}



	public static void main(String args[]) {

		int[] arr = { 8, 7, 2, 1, 0, 9, 6 };
		int size=arr.length;
		quickSort(arr, 0, size - 1);
		System.out.println(Arrays.toString(arr));
	}
}