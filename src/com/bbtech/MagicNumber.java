package com.bbtech;

/*
* A number is magic number if the sum and product of the individual number
* is divisible by the length of array.
* e.g. arr = {8,28,34,64}
* length of arr = 4
* sum of 8 is 8 and product also 8 and is divisible by 4 so, it's magic number.
* 28, sum is 10 and product is 16 sum not divisible by 4 so not a magic number.
* */
public class MagicNumber {

    public static void main(String[] args) {
        int[] arr = {8,28,34,64};
        System.out.println(findMagicNum(arr, arr.length));
    }

    private static int findMagicNum(int[] arr, int length) {
        int result = -1;

        for(int i =0; i< length; i++){
            int num = arr[i];
            int sum = 0;
            int product = 1;
            while(num > 0){
                int rem = num % 10;
                num = num / 10;
                sum += rem;
                product *= rem;
            }
            if(sum % length == 0 && product % length == 0){
                result = arr[i];
                break;
            }
        }
        return result;
    }
}
