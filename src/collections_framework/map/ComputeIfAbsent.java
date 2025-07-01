package collections_framework.map;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsent {
    public static void main(String[] args) {
       String[] fruits = {"Apple","Banana","Cherry","Apple","Apple","Banana"};
       Map<String,Integer> mp = new HashMap<>();
       for(String fruit:fruits){
           mp.computeIfAbsent(fruit,k->0);
           mp.put(fruit,mp.get(fruit)+1);
       }

        System.out.println(mp);
       for(Map.Entry<String,Integer> it:mp.entrySet()){
           System.out.println("Key : "+it.getKey() + " Value : "+it.getValue());
       }
    }
}
