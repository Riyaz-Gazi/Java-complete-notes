package java8.functional_interface;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Predicate
        Predicate<Integer> predicate = num -> num % 2 == 0;
        List<Integer> evenNumber = nums.stream().filter(predicate).collect(Collectors.toList());
        System.out.println("Even Number : " + evenNumber);

        // Function
        Function<Integer, Integer> function = num -> num * num;
        List<Integer> square = nums.stream().map(function).collect(Collectors.toList());
        System.out.println("Square Number : " + square);

        // Consumer
        Consumer<Integer> consumer = (num) -> System.out.println("number is " + num);
        nums.forEach(consumer);

        // Supplier
        Supplier<String> supplier = () -> "Hello From Suppliers";
        System.out.println(supplier.get());

    }
}
