package com.bbtech.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Finding the missing number in the range of 0 to N
    given array [4, 0, 1, 2, 6, 7]
    here missing element is 3.

    Apply the cyclic sort and then compare the index with the arr[index].
    if its does not match then return the index. It's your answer.
 */
public class FindingMissingNumber {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1, 6, 7};
        System.out.println(findMissingNum(arr));
        System.out.println(Arrays.toString(arr));
    }

    private static List<Integer> findMissingNum(int[] arr) {
        int start = 0;
        int end = arr.length;

        while(start < end){
            int correctIdx = arr[start];
            //check array for out of bound exception
            if(arr[start] < end && arr[start] != arr[correctIdx]){
                swap(arr, start, correctIdx);
            }else{
                start++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < end; i++) {
            if(arr[i] != i){
                list.add(i);
            }
        }
        return list;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
