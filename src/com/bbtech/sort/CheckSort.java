package com.bbtech.sort;

public class CheckSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,9};
        System.out.println(isSorted(arr, 0));
    }
    /**
     * We'll know the array is sorted, if the current element is less than the next element.
     * */
    private static boolean isSorted(int[] arr, int index) {
        //base condition to break the recursion
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}
