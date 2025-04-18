package com.bbtech.search.binary;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,8,9,12,19,29,38,89};
        int target = 38;
        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while (start < end){
            int mid = start + (end - start) / 2;
            //target < mid-element then start point will be same only end position will be mid - 1
            if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]) { //target > mid-element, then end will be same but start = mid+1
                start = mid + 1;
            }else {
                return mid; // target == mid, we found our element.
            }
        }
        return -1;
    }
}
