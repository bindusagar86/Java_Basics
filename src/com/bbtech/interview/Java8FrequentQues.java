package com.bbtech.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8FrequentQues {

    public static void main(String[] args) {
        //1. count number of character in a string
        String input = "ilovejavaworld";
        Map<String, Long> results = Stream.of(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(results);

        //2. Find the duplicate char in a string
        List<String> duplicateElements = Stream.of(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicateElements);

        //3. Find the 1st non-repeat char in string
        String firstNonRepeatChar = Stream.of(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
        System.out.println("1st non-repeat char : " + firstNonRepeatChar);

        //4. Find the nth highest number from an array
        int[] numbers = {2,4,9,11,3,5,19,8,7,1,21};
        Integer num = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingInt(e -> - e.getKey()))
                .map(Map.Entry::getKey)
                .toList()
                .get(1);
        System.out.println("2nd highest number : " + num + " in array : " + Arrays.toString(numbers));

        Integer secondHighestNum = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondHighestNum);

        //5. Find the longest string in a given array
        String[] strArr = {"java", "springboot", "microservice", "hibernate", "c++"};
        Map.Entry<String, Integer> list = Arrays.stream(strArr)
                .collect(Collectors.toMap(Function.identity(), s -> s.length()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .toList()
                .get(0);
        System.out.println(list);

        String lonestString = Arrays.stream(strArr)
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2)
                .get();

        System.out.println(lonestString);

        //6. Find the numbers starting with 1 from array
        List<String> nums = Arrays.stream(numbers)
                .boxed()
                .map(String::valueOf)
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println("Number staring with 1 : " + nums);
    }
}
