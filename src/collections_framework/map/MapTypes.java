package collections_framework.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTypes {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer,String> treeMap = new TreeMap<>();

        hashMap.put(2,"Banana");
        hashMap.put(1,"Apple");
        hashMap.put(null,"Cheery");

        linkedHashMap.put(2,"Banana");
        linkedHashMap.put(1,"Apple");

        treeMap.put(2,"Banana");
        treeMap.put(1,"Apple");
//        treeMap.put(null,"Cheery"); throw null pointer exception , because treemap not allows null key

        System.out.println(hashMap);
        System.out.println(linkedHashMap);
        System.out.println(treeMap);
    }
}
