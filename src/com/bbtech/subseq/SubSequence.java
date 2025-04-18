package com.bbtech.subseq;

public class SubSequence {
    public static void main(String[] args) {
        String s = "abc";
        subSequence("", s);
    }

    private static void subSequence(String p, String up) {
        //if unpressed is empty we got our processed elements
        if(up.isBlank()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //add the 1st element to the process elements
        subSequence(p + ch, up.substring(1));
        //ignore the 1st element from the processed element
        subSequence(p, up.substring(1));
    }
}
