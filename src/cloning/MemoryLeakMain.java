package cloning;

import java.util.ArrayList;
import java.util.List;

class MemoryLeak{
    private static List<Object> staticList = new ArrayList<>();

    public void addToStaticList(Object obj){
        staticList.add(obj);
    }
}

public class MemoryLeakMain {
    public static void main(String[] args) {
        MemoryLeak example = new MemoryLeak();
        for(int i=0;i<100000;i++){
            example.addToStaticList(new Object());
        }

        System.out.println("Objects added to static list");

    }
}
