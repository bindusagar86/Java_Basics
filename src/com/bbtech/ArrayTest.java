package com.bbtech;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        //2D array is an arrays of array i.e. each element of array contains another array
        //e.g. arr[0] = [1,2,3], arr[1] = [4,5,6], arr[2] = [7,8,9]
        //input
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        //output
        System.out.println("Using normal for loop");
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] +" ");
            }
            System.out.println();
        }

        System.out.println("Using Arrays class");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println("Using enhanced for-loop and Arrays class");
        for(int[] a : arr){ //here each element of array is a type or int[]
            System.out.println(Arrays.toString(a));
        }
    }
}
