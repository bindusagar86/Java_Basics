package com.bbtech.recursion;

public class BinarySearchUsingRecursion {

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 9, 11, 19, 22, 33};
        int target = 7;
        int ans = search(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int search(int[] arr,int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(target == arr[mid]){
            return mid;
        }
        //target < arr[mid] then target element present in left of middle element else in the right
        if(target < arr[mid]){
            return search(arr, target, start, mid - 1);
        }
        return search(arr, target, mid + 1, end);
    }
}
