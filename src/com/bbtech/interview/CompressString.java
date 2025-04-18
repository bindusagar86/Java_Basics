package com.bbtech.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//compress a string
//e.g.: aaabbbcc is a3b3c2
public class CompressString {

    public static void main(String[] args) {
        String str = "aaabbbcc";
        System.out.println(compressUsingJava8(str));
        compressUsingMap(str);
    }

    private static void compressUsingMap(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }else {
                map.put(str.charAt(i), 1);
            }
        }
        String newStr = "";
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            newStr += newStr.join("",entry.getKey().toString(),entry.getValue().toString());
        }
        System.out.println("Result: "+newStr);
        String result = map.entrySet()
                .stream()
                .map(e -> e.getKey().toString() + e.getValue())
                .collect(Collectors.joining());
        System.out.println(result);
    }

    private static String compressUsingJava8(String str) {
        String result = Stream.of(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().map(entry -> entry.getKey() + entry.getValue())
                .collect(Collectors.joining());
//        System.out.println(result);
        return result;
    }
}
