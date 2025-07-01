package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        // Method - 1 Form Collections (List,Set , etc)

        List<Integer> arr1 = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 6);
        Stream<Integer> arr1Stream = arr1.stream();
        final List<Integer> collect = arr1Stream.distinct().filter(x -> x % 2 == 0).map(x -> x * x).sorted().limit(2).collect(Collectors.toList());
        System.out.println(collect);

        // Method - Form Arrays
        String[] fruits = {"Apple", "Banana", "Orange"};
        Stream<String> stringStream = Arrays.stream(fruits);
        final long count = stringStream.skip(1).count();
        System.out.println(count);

        // Method - 1;
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream.forEach(x -> System.out.println("value of the integer is " + x));

    }
}
