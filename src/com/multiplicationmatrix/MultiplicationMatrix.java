package com.multiplicationmatrix;

public class MultiplicationMatrix {
	 public static int[][] multiplyMatrices(int[][] A, int[][] B) {
	        int numRowsA = A.length;
	        int numColsA = A[0].length;
	        int numColsB = B[0].length;

	        if (numColsA != B.length) {
	            throw new IllegalArgumentException("Matrix dimensions are not suitable for multiplication");
	        }

	        int[][] result = new int[numRowsA][numColsB];

	        for (int i = 0; i < numRowsA; i++) {
	            for (int j = 0; j < numColsB; j++) {
	                for (int k = 0; k < numColsA; k++) {
	                    result[i][j] += A[i][k] * B[k][j];
	                }
	            }
	        }

	        return result;
	    }
	 public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    }

	public static void main(String[] args) {
		int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrixB = {{7, 8}, {9, 10}, {11, 12}};

        int[][] result = multiplyMatrices(matrixA, matrixB);

        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("Matrix B:");
        printMatrix(matrixB);

        System.out.println("Matrix A x B:");
        printMatrix(result);

	}

}
