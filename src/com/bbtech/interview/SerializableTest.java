package com.bbtech.interview;

import java.io.*;

public class SerializableTest implements Serializable {

    //Normal variable
    int i = 10, j = 20;

    //Transient variable default value will be store in file i.e. 0
    transient int k = 30;

    //Use of transient has no impact below on static and final variable
    transient static int l = 40;
    transient final int m = 50;

    public static void main(String[] args) throws Exception {
        SerializableTest input = new SerializableTest();

        //write into file
        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("Test.txt"));
        ous.writeObject(input);

        //Read from file
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Test.txt"));
        SerializableTest output = (SerializableTest) ois.readObject();

        System.out.println("i : " + output.i);
        System.out.println("j : " + output.j);
        System.out.println("k : " + output.k);
        System.out.println("l : " + output.l);
        System.out.println("m : " + output.m);
    }
}
