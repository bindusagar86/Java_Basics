package com.bbtech.interview;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateChar {

    public static void main(String[] args) {
        String str = "cuttack";
        findDuplicate(str);
        System.out.println("Using Map");
        findDuplicateUsingMap(str);
    }

    private static void findDuplicateUsingMap(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray() ) {
            int count = 1;
            if(map.containsKey(ch)){
                count++;
                map.put(ch, count);
            }else{
                map.put(ch, count);
            }
        }
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Duplicate char: "+ entry.getKey()
                        +", count: "+entry.getValue()));
    }

    private static void findDuplicate(String str) {
        char[] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            int count = 1;
            for (int j = i+1; j < strArr.length; j++) {
                if(strArr[i] == strArr[j]){
                    count++;
                }
            }
            if(count > 1){
                System.out.println("Duplicate char: "+ strArr[i] +", count: "+count);
            }
        }
    }
}
