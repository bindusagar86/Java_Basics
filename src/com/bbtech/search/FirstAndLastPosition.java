package com.bbtech.search;

import java.util.Arrays;

/*
    Find first and last position of a number in sorted array
    arr = {5,7,7,7,7,8,8,10}
    target = 7
    then result will be {1,4}
    Solution: Use binary search
 */
public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    private static int[] searchRange(int[] arr, int target) {
        return new int[] {search(arr, target, true),search(arr, target, false)};
    }

    private static int search(int[] arr, int target, boolean findFirstIndex) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                ans = mid;
                if(findFirstIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return  ans;
    }
}
