package com.bbtech;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        int a = 10, b = 20;
        swap(a,b);
        System.out.println(a+" "+b);
        main("hello");

        String s1 = "java";
        String s2 = "java";

        String s3 = s1.replace("java", "hello");
        System.out.println(s1 + " : " + s3);
        System.out.println(s1.equals(s2));

        String s4 = new String("java");
        System.out.println(s1==s4.intern());
        System.out.println(s1.equals(s4));
    }

    public static void main(String args) {
        System.out.println("normal function");
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
