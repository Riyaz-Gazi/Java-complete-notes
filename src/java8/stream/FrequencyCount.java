package java8.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyCount {
    public static void main(String[] args) {
        // Frequency of each element in array
        int[] arr = {1, 2, 3, 1, 1, 2, 3, 4};
        final Map<Integer, Long> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        i -> i,
                        Collectors.counting()
                ));

        System.out.println(collect);

        // Frequency of each character of a string
        String str = "aaabbb aa bb cc";
        final Map<Character, Long> freqCount = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));

        System.out.println(freqCount);
    }
}
