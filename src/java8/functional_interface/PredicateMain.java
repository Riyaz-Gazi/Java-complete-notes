package java8.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateMain {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
