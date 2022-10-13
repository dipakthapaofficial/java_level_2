package com.codeinteracts.level2.inheritance;

import java.util.Scanner;

public class MatrixMul {
	
	void printMatrix(int[][] number) {
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				System.out.printf(number[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	int[][] enterMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size of array");
		int row = sc.nextInt();
		System.out.println("Enter column size of array");
		int column = sc.nextInt();
		int[][] number = new int[row][column];
		
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				System.out.println("Enter number::");
				int num = sc.nextInt();
				number[i][j] = num;
			}
		}
		
		return number;
		
	}
	
	int[][] multiplyMatrix(int[][] mat1, int[][] mat2) {
		int matMul[][] = new int[mat1.length][mat2[0].length];
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat2[0].length; j++) {
				int sum1 = 0;
				for (int k = 0; k < mat2.length; k++) {
					sum1 += mat1[i][k] * mat2[k][j];
				}
				matMul[i][j] = sum1;
			}
			System.out.println();
		}
		
		return matMul;
	}
	
	public static void main(String[] args) {
		MatrixMul mul = new MatrixMul();
		int[][] matrix1 = mul.enterMatrix();
		mul.printMatrix(matrix1);
		
		int[][] matrix2 = mul.enterMatrix();
		mul.printMatrix(matrix2);
		
		int[][] matMul = mul.multiplyMatrix(matrix1, matrix2);
		mul.printMatrix(matMul);

	}
	
}
