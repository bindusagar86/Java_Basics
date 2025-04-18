package com.bbtech.search.binary;

public class CeilingNumber {

    public static void main(String[] args) {
        int[] arr = {1,3,5,9,12,16,19};
        int target = 17;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(ceilingNumber(arr, start, end, target));
    }

    private static int ceilingNumber(int[] arr, int start, int end, int target) {
        if(start > end){
            return arr[start];
        }

        int mid = start + (end - start)/2;

        if(arr[mid] == target){
            return arr[mid];
        }

        if(target > arr[mid]){
            return ceilingNumber(arr, mid +1, end, target);
        }
        return ceilingNumber(arr, start, mid - 1, target);
    }
}
