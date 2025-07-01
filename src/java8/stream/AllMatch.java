package java8.stream;

import java.util.Arrays;
import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8);
        boolean allEven = list.stream().anyMatch(x->x%2==0);
        System.out.println(allEven);
    }
}
