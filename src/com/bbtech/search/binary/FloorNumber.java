package com.bbtech.search.binary;

public class FloorNumber {

    public static void main(String[] args) {
        int[] arr = {1,3,5,9,12,14,16,19};
        int target = 12;
        System.out.println(floorNumber(arr, target, 0, arr.length - 1));
    }

    private static int floorNumber(int[] arr, int target, int start, int end) {
        if(start > end){
            return arr[end];
        }

        int mid = start + (end - start)/2;

        if(target == arr[mid]){
            return arr[mid];
        }

        if(target > arr[mid]){
            return floorNumber(arr, target, mid + 1, end);
        }
        return floorNumber(arr, target, start, mid - 1);
    }
}
