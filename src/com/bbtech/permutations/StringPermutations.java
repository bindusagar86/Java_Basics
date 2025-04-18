package com.bbtech.permutations;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static void main(String[] args) {
        System.out.println(findPermutationsList("", "abc", new ArrayList<>()));
    }

    static void findPermutations(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            findPermutations(f + ch + s, up.substring(1));
        }
    }

    static List<String> findPermutationsList(String p, String up, List<String> list) {
        if(up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            findPermutationsList(f + ch + s, up.substring(1), list);
        }
        return list;
    }
}
