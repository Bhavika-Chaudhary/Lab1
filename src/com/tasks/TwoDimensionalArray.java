package com.tasks;

public class TwoDimensionalArray {
    public static void main(){
        int[][] matrix = new int[10][10];
        int Sum = 0;

        for (int i = 0; i < 10; i++) {
        matrix[i][i] = i;
        Sum += matrix[i][i];
        }

        System.out.println("Matrix:");
        for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
        System.out.print(matrix[i][j] + " ");
            }
                    System.out.println();
        }
                System.out.println("\nSum of diagonal elements: " + Sum);
    }
}
