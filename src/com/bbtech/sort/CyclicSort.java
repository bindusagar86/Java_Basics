package com.bbtech.sort;

import java.util.Arrays;

/*
    when there is a range of integer given 1...n or 0...n
    so in that case apply cyclic sort to sort the array.

    In cyclic sort we have to sort the array in O(n) complexity.
    Here we have to find the index value should be equal or index + 1
    to compare with the array value, if it's not equal than swap the value.
 */
public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int start = 0;
        int end = arr.length;

        while (start < end){
            //when range start from 0...n then correctIdx = arr[start]
            // else correctIdx = arr[start] - 1
            int correctIdx = arr[start];
            if(arr[start] != arr[correctIdx]){
                swap(arr, correctIdx, start);
            }else{
                start++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
