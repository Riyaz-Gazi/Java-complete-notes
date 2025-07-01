package string;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String words = "Apple,Banana,Orange";
        final String[] fruits = words.split(",");
        Arrays.stream(fruits).forEach(System.out::println);

    }
}
