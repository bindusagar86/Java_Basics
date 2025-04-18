package com.bbtech.recursion;

public class PrintNumberRecursively {
    public static void main(String[] args) {
//        print(1);
//        print1ToN(5);
        printNTo1(5);
    }

    private static void print(int n) {
        if (n > 5){
            return;
        }
        System.out.println(n);
        print(n + 1);
    }

    private static void print1ToN(int n) {
        if (n == 1){
            System.out.println(1);
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }

    private static void printNTo1(int n) {
        if (n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNTo1(n - 1);
    }
}
