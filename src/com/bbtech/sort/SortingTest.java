package com.bbtech.sort;

import java.util.Arrays;

public class SortingTest {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
//        selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void insertionSort(int[] arr) {
        //i is outer loop to iterate over the array
        for (int i = 0; i < arr.length - 1; i++) {
            //j is inner loop which will compare the current element with the previous element till j > 0
            for (int j= i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }

        }
    }

    //find the max element and swap it with the correct index
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1; //we have to exclude the last element, since it's sorted
            int max = getMaxIndex(arr, 0, lastIndex);
            swap(arr, max, lastIndex);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end ; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
