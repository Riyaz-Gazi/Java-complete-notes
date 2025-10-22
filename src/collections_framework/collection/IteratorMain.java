package collections_framework.collection;

import java.util.*;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        Iterator<String> iterator =  fruits.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
