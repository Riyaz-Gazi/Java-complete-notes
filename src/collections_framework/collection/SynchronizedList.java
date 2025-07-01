package collections_framework.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList {
    public static void main(String[] args) {
         List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
         synchronizedList.add("Apple");

         synchronized (synchronizedList){
             for(String s:synchronizedList){
                 System.out.println(s);
             }
         }
    }
}
