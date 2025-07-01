package collections_framework.collection;

import java.util.*;

public class SetType {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Cherry");
        hashSet.add("Banana");
        hashSet.add("Apple");

        linkedHashSet.add("Cherry");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");

        treeSet.add("Cherry");
        treeSet.add("Banana");
        treeSet.add("Apple");

        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
