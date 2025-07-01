package collections_framework.map;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfPresent {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("Apple",2);
        mp.put("Banana",1);
        mp.computeIfPresent("Apple",(k,v)->v+1);
        mp.computeIfPresent("Orange",(k,v)->v+1);
        System.out.println(mp);

        Map<String, Integer> stock = new HashMap<>();
        stock.put("pen", 0);
        stock.put("pencil", 10);

        // Remove if quantity is zero
        stock.computeIfPresent("pen", (k, v) -> v == 0 ? null : v);

        System.out.println(stock);
    }
}
