package com.bbtech.inheritance;

public class Child extends  Parent{
    private String addr;

    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println(parent);
//        parent.doStuff("bindu"); since doStuff(string) is not declare in parent

        Child child = new Child();
        child.doStuff("bindu");
    }

    public void doStuff(String name){
        System.out.println(name);
    }
}
