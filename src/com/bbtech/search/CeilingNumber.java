package com.bbtech.search;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 6;
        System.out.printf("Ceiling of %d from array is: %d", target, ceiling(arr, target));
    }

    //returned the number that is the greater than equal to the target number
    private static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end]){
            return -1;
        }

        while (start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                return arr[mid];
            }
        }
        //since we didn't find the target element in the array
        //the start index hold the next greater number that is closer to the target.
        return arr[start];
    }
}
