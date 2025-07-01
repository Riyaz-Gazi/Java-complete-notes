package java8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Charlie", "David")
        );

        // Using Map to product list of string
        final List<Stream<String>> collect1 = nestedList.stream().map(List::stream).collect(Collectors.toList());

        // Using flatmap to find result

        final List<String> collect = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(collect);
    }
}
