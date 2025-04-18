package com.bbtech.interview;

import java.util.HashSet;
import java.util.Set;

/*
    Given a range of 1...N integer array find the duplicate element.
    Apply the cyclic sort to the array.
    Check if the value present in the index is correct or not, if not then
    check in the index the element present at that index is correct else swap.
 */
public class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4, 3};
        System.out.println(findDuplicateUsingSet(arr));
    }

    static int findDuplicateUsingSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!set.add(arr[i])){
                return arr[i];
            }
        }
        return -1;
    }

    private static int findDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length;

        while (start < end){
            //check if value present at index start + 1 == arr[start]
            //if not present then proceed to cyclic sort else increase the index
            if(arr[start] != start + 1){
                int correctIdx = arr[start] - 1;
                //if value present at index start and correctIdx are equal then we found our
                // duplicate element, return arr[start]
                if(arr[start] != arr[correctIdx]){
                    swap(arr, start, correctIdx);
                }else {
                    return arr[start];
                }
            }else {
                start++;
            }
        }
        return -1;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
