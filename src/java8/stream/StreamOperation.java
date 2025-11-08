package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String[] args) {

        // Method - 1 Form Collections (List,Set , etc)
        List<Integer> arr1 = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 6);
        Stream<Integer> arr1Stream = arr1.stream();
        final List<Integer> collect = arr1Stream.distinct().filter(x -> x % 2 == 0).map(x -> x * x).sorted().limit(2).collect(Collectors.toList());
        System.out.println(collect);

        // Method - 2 Form Arrays
        String[] fruits = {"Apple", "Banana", "Orange"};
        Stream<String> stringStream = Arrays.stream(fruits);
        final long count = stringStream.skip(1).count();
        System.out.println(count);

        // Method - 3 create stream
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream.forEach(x -> System.out.println("value of the integer is " + x));

        // Reduce Operation

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int product = nums.stream().mapToInt(Integer::intValue).reduce(1, (a, b) -> a * b);
        System.out.println(product);

        // All Matches , Any Matches , None Matches
        boolean allEven = nums.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(allEven);

        // FlatMap
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Charlie", "David")
        );

        List<String> flatentList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("Flatten List : " + flatentList);

        int[][] number = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        int[] array = Arrays.stream(number).flatMapToInt(Arrays::stream).toArray();
        System.out.println(Arrays.toString(array));

        // Count Frequency of Each Fruit using toMap
        List<String> fruit = Arrays.asList("Apple", "Banana", "Orange", "Apple");
        Map<String, Integer> frequencyCount = fruit.stream().collect(Collectors.toMap(
                item -> item,
                item -> 1,
                (a, b) -> a + b
        ));

        System.out.println(frequencyCount);

        // Frequency Count Using Grouping
        int[] arr = {1, 2, 3, 1, 1, 2, 3, 4};
        Map<Integer, Long> freqCount = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        i -> i,
                        Collectors.counting()
                ));
        System.out.println(freqCount);

        // Frequency of each character of a string
        String str = "aaabbb aa bb cc";

        Map<Character, Long> frequencyCountChar = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(
                        i -> i,
                        Collectors.counting()
                ));

        System.out.println(frequencyCountChar);

        // partitioningBy
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> evenOddMap = list.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(evenOddMap);
        System.out.println(evenOddMap.get(true)); // even number
        System.out.println(evenOddMap.get(false)); // odd number
    }
}
