package com.bbtech.search.linear;

public class FindElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,9,1,10,99,34,5};
        int target = 99;
        System.out.println(findElement(arr, target));
    }

    private static int findElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
