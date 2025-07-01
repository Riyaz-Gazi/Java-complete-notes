package java8.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        Consumer<String> print = s-> System.out.println("Processed : "+s);
        List<String> items = Arrays.asList("Apple","Banana","Orange");
        items.forEach(print);
    }
}
