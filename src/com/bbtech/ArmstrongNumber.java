package com.bbtech;

import java.util.Scanner;

/*
    A number is armstrong number if the summation of the cube of individual number is that number.
    e.g. 153 = 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(isArmstrong(n));
    }

    private static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            n = n / 10;

            sum += rem * rem * rem;
        }
        return original == sum;
    }
}
