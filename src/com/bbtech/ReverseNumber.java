package com.bbtech;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to reverse : ");
        int num = in.nextInt();
        int reverseNum = 0;

        while(num > 0){
            int n = num %  10;
            reverseNum = reverseNum * 10 + n;
            num = num / 10;
        }
        System.out.println("Reverse Number is : "+reverseNum);
    }
}
