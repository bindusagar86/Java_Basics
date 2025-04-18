package com.bbtech.array;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {5,8,9,3,1,2,4};
        System.out.println("2nd smallest element in the array: "+findSecondSmallestNumber(arr));
    }

    private static int findSecondSmallestNumber(int[] arr) {
        if(arr.length < 2) {
            return -1;
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int num : arr){
            if(num < smallest){
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }

        }
        if(secondSmallest == Integer.MAX_VALUE) {
            return -1;
        }
        return secondSmallest;
    }
}
