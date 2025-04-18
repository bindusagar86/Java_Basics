package com.bbtech;

public class FindMaxWealth {

    public static void main(String[] args) {
        int[][] arr = {
                {3, 6, 9},
                {1, 31, 5},
                {2, 3, 4}
        };
        System.out.println(findMaxWealth(arr));
    }
    //max wealth will be the max of the summation of each array
    private static int findMaxWealth(int[][] arr) {
        if(arr.length == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
