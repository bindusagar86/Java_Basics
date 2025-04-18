package com.bbtech.search;

import java.util.Arrays;

public class ArraySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 3, 54},
                {2, 43, 50},
                {5, 44,33}
        };
        System.out.println(Arrays.toString(search(arr, 33)));
    }

    private static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
