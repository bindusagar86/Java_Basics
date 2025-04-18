package com.bbtech.search;

import java.util.Arrays;

/*
    Find the target element in the given sorted array.
    The array is sorted by row wise and column wise.
 */
public class Sorted2DArraySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {17, 27, 37, 47},
                {19, 29, 39, 50}
        };
        int target = 47;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    /*
        since the array is sorted in row wise and column wise,
        the starting element will be the 0th index and end index
        will be the last column.

        Here we have to search the target using below steps:
        step 1: if element == target, result found.
        step 2: if element > target, then no need to search in that column
                as in that column all the remaining element will be greater than the target.
                then do decrease the col by one.
        step 3: if element < target, then no need to search in that row as in that row
                every element will be less than the target.
                so we can increase the row by one.
     */
    private static int[] search(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;

        while (row < arr.length && col > 0){
            if(arr[row][col] == target){
                return new int[] {row, col};
            }
            if(arr[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return new int[] {-1, -1};
    }
}
