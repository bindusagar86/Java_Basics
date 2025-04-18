package com.bbtech.array;

import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix: ");
        int[][] arr = new int[3][3];
        //arr.length will give length of row i.e. 3
        for (int row = 0; row < arr.length; row++) {
            //to get the column length we have get from each row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        //output
        for (int row = 0; row < arr.length; row++) {
            //to get the column length we have get from each row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
