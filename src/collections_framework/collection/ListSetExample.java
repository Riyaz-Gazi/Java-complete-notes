package collections_framework.collection;

import java.util.*;

public class ListSetExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");

        Set<String> fruitsSet = new HashSet<>(fruits);

        System.out.println(fruits);
        System.out.println(fruitsSet);
    }
}
