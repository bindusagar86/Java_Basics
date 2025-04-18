package com.bbtech.search;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 6;
        System.out.printf("Floor of %d from array is: %d", target, floor(arr, target));
    }

    //returned the number that is the smaller than equal to the target number
    private static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target < arr[start]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else{
                return  arr[mid];
            }
        }
        //since the number didn't find in the array,
        // the next element close to the target number will be end index
        // as it'll be next smaller to the target element.
        return arr[end];
    }
}
