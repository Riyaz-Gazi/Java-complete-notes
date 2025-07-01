package collections_framework.collection;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtility {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(9);

        System.out.println("Maximum : "+ Collections.max(list));
        System.out.println("Minimum : "+Collections.min(list));

        System.out.println("Binary Search : "+Collections.binarySearch(list,2));
        Collections.sort(list);
        System.out.println(list);
    }
}
