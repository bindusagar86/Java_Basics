package com.bbtech.recursion;

public class ReversNumber {

    static int sum = 0;
    static void reverse1(int num) {
        if(num  == 0) {
            return;
        }
        int rem = num % 10;
        sum = sum * 10 + rem;
        reverse1(num / 10);
    }

    static int reverse2(int num) {
        int digits = (int) (Math.log10(num)) + 1;
        System.out.println("digits : "+ digits);
        return helper(num, digits);
    }

    private static int helper(int num, int digits) {
        if(num % 10 == num) {
            return num;
        }
        return (num % 10) * (int) Math.pow(10, digits - 1) + helper(num / 10, digits -1);
    }

    public static void main(String[] args) {
        reverse1(1234);
        System.out.println(sum);
        System.out.println(reverse2(1203));
    }
}
