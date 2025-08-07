package exception;

import java.util.ArrayList;
import java.util.*;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();

        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        lists.add(5);
        lists.add(6);

//        for(int list:lists){
//            lists.remove(list = 1);
//        }

        // Type - I

        Iterator<Integer> iterator = lists.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value == 1) {
                iterator.remove();
            }
        }
        System.out.println(lists);

        // Type - II
        lists.removeIf(num -> num % 2 == 0);

        System.out.println(lists);

        // Type - III

        List<Integer> removeOdd = new ArrayList<>();

        for (int n : lists) {
            if (n % 2 != 0) {
                removeOdd.add(n);
            }
        }

        lists.removeAll(removeOdd);

        System.out.println(lists);

    }
}
