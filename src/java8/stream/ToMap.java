package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMap {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Apple");
        final Map<String, Integer> collect = fruits.stream().collect(Collectors.toMap(
                item -> item,
                item -> 1,
                Integer::sum
        ));
        System.out.println(collect);
    }
}
