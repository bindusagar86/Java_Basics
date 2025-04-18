package com.bbtech.sort;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /**
     * In cyclic sort we have to sort the element in O(n).
     * Cyclic sort is applicable when the given array is given in 1 to N  or 0 to N range.
     * */
    private static  void  cyclicSort(int[] arr) {
        int i = 0;
        //Iterate over the elements
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            //check if the element is present in correct index or not i.e. index = value - 1
            //else move to the next element i.e. increase the counter
            if(arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    private static void selectionSort(int[] arr) {
        //get the max element from the array and swap it with its correct position
        //e.g. always the max element should be present at the last index in a sorted array, so we have
        // to make like it.
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            // we have to find max element from 0 to the last element in remaining array
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    private static void bubbleSort(int[] arr) {
        //first iterate over the whole array
        for (int i = 0; i < arr.length; i++) {
            //compare the next adjacent element to know if it's greater then swap
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
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
