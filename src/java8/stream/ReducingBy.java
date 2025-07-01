package java8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class ReducingBy {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        final Map<Integer, Integer> collect = names.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.reducing(0, String::length, Integer::sum)
        ));

        System.out.println(collect);

        final Map<Integer, List<String>> collected = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collected);
    }
}
