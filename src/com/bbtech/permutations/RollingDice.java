package com.bbtech.permutations;

import java.util.ArrayList;
import java.util.List;

public class RollingDice {
    public static void main(String[] args) {
        roll("",4);
        System.out.println(diceCombinations("", 4, new ArrayList<>()));
    }

    private static void roll(String result, int target) {
        if (target == 0) {
            System.out.println(result);
            return;
        }
        int sum = 0;
        for (int i = 1; i <= target ; i++) {
            roll(result + i, target - i);
        }
    }

    private static List<String> diceCombinations(String result, int target, List<String> list) {
        if (target == 0) {
            list.add(result);
            return list;
        }
        int sum = 0;
        for (int i = 1; i <= target ; i++) {
            diceCombinations(result + i, target - i, list);
        }
        return list;
    }
}
