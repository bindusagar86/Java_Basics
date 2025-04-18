package com.bbtech.misc;

class B {
    String name;
    B(String name){
        this.name = name;
    }
}

public class StaticExample {

    static class A {
        String name;
        A(String name){
            this.name = name;
        }
    }

    class C {
        String name;
        C(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        B b = new B("B");
        System.out.println(b.name);

        A a = new A("a");
        System.out.println(a.name);

//        C c = new C("c"); we can't call non-static class from static method
    }
}
