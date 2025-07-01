package java8.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionMain {
    public static void main(String[] args) {
        Function<String,Integer> lengthFunction = String::length;
        List<String> fruits = Arrays.asList("Apple","Banana","Orange");
        List<Integer> fruitsLength = fruits.stream().map(lengthFunction).collect(Collectors.toList());
//        List<Integer> fruitsLength = fruits.stream().map(lengthFunction).toList(); //unmodifiable List
        System.out.println(fruitsLength);
    }
}
