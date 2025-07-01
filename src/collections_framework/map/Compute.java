package collections_framework.map;

import java.util.*;

public class Compute {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 50);

        // Add 10 points to Alice (key exists)
        scores.compute("Alice", (k, v) -> v + 10); // 60

        // Add entry for Bob (key does not exist → v is null)
        scores.compute("Bob", (k, v) -> (v == null ? 0 : v) + 20); // 20

        System.out.println(scores);

    }
}
