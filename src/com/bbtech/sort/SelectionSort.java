package com.bbtech.sort;

import java.util.Arrays;

/*
    In selection sort, we have to select the max element in each iteration and swap it with correct index.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5, 2, 0, -9};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //to exclude already sorted array element
            int last = arr.length - 1 - i;
            //we have chosen max element will be the 0th index
            int max = findMaxIndex(arr, 0, last);
            swap(arr, max, last);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int findMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
