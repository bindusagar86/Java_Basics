package com.bbtech.sort;

import java.util.Arrays;

/*
    In bubble sort on each iteration the largest element move to the end of the array.
    It works on comparing against it's next adjacent element, if its greater than the
     adjacent element then swap the element.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 7, 3, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr) {
        boolean swapped;
        //to iterate over the array
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //to compare the adjacent element
            for (int j = 1; j < arr.length - i; j++) {
                //compare the adjacent element
                if (arr[j] < arr[j - 1]){
                    //swap the element
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            //if it's not swapped in any of the iteration, that means array is sorted.
            if (!swapped){
                break;
            }
        }
    }
}
