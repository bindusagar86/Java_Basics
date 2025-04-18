package com.bbtech;

public class FindEvenFromNumber {
    public static void main(String[] args) {
        int[] nums = {123, 342, 2134, 45, 980};
        System.out.println(getEven(nums));
    }

    private static int getEven(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int c = 0;
        for(int num : nums){
            int count = 0;
            while(num > 0){
                count++;
                num /= 10;
            }
            if(count % 2 == 0){
                c++;
            }
        }
        return  c;
    }
}
