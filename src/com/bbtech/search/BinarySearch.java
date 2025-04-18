package com.bbtech.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,10,12,19,22,45};
        int target = 24;
        System.out.println(binarySearch(arr, target));
    }

    //here we assume that array is sorted in ascending order.
    //return -1, if the target element is not found in the array.
    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //the int range may exceed that's why we are finding the mid like below
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
