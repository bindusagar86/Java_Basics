package com.bbtech;

import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println("Using Math.Max : "+Math.max(num1,(Math.max(num2,num3))));

        int max = num1;
        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }
        System.out.println("Max number is : "+ max);
    }
}
