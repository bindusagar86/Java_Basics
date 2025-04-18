package com.bbtech.array;

public class FindMaxInArray {

    public static void main(String[] args) {
        int[] arr = {2,1,5,9,7,6,3};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max element in array is: "+max);
    }
}
