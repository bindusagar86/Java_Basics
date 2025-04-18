package com.bbtech.permutations;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    static String[] numToLetters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        findCombination("", "79");
        System.out.println(collectCombinations("", "79", new ArrayList<>()));
    }

    private static void findCombination(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        String letters = numToLetters[up.charAt(0) - '2'];

        for (char letter : letters.toCharArray()) {
            findCombination(p + letter, up.substring(1));
        }
    }

    private static List<String> collectCombinations(String p, String up, List<String> result) {
        if (up.isEmpty()) {
            result.add(p);
            return  result;
        }
        String letters = numToLetters[up.charAt(0) - '2'];

        for (char letter : letters.toCharArray()) {
            collectCombinations(p + letter, up.substring(1), result);
        }
        return result;
    }
}
