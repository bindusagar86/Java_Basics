package com.bbtech.sort;

import java.util.Arrays;

/*
    In insertion sort, it'll compare the current element with the left side array.
    If the left side is already sorted, break the loop, as the array is sorted now.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
        //outer loop to iterate over the array
        //require n - 2 iteration, since the inner loop will give out of bound error after this
        for (int i = 0; i < arr.length - 1; i++) {
            //on each comparision decrement the size of the array
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
