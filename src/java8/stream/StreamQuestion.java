package java8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamQuestion {
    public static void main(String[] args) {
        /**
         * Find the sum,
         * product ,
         * maximum ,minimum  ,
         * even  ,
         * average elements in list,
         * second largest,
         * kth largest
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum : " + sum);

        int product = numbers.stream().mapToInt(Integer::intValue).reduce(1,(a,b)->a*b);
        System.out.println("Product : "+product);

        int max = numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println("Maximum elements : "+max);

        List<Integer> even = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("Even elements from the list : "+even);

        double average = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
        System.out.println("Average : "+average);

        Optional<Integer> secondLargest = numbers.stream().sorted((a,b)->Integer.compare(b,a)).skip(1).findFirst();
        if(secondLargest.isPresent()){
            System.out.println("Second largest elements : "+secondLargest.get());
        }


        /**
         * find the count of fruits contains 'g' ,
         * to UPPERCASE ,
         * sorted reverse order,
         * length of each fruit,
         * find the longest string
         */

        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape");
        char searchChar = 'g';
        long count = fruits.stream().filter(val->val.contains(String.valueOf(searchChar))).count();
        System.out.println("Count : "+count);

        List<String> FRUITS = fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("FRUITS : "+FRUITS);

        List<String> sortedFruits = fruits.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Fruits sorted in reverse order : "+sortedFruits);

        List<Integer> fruitsLength = fruits.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Length of each fruits : "+fruitsLength);

        String longestFruits = fruits.stream().max(String::compareTo).get();
        System.out.println("Longest Fruits : "+longestFruits);

        String shortestFruits = fruits.stream().min(String::compareTo).get();
        System.out.println("Shortest Fruits : "+shortestFruits);

    }
}
