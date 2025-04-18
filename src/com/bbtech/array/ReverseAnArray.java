package com.bbtech.array;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {2,4,9,1,8,7};
        reverse(arr);
    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){ //this is called two pointer pattern
            swap(arr,start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr,int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
