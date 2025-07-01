package annotation_reflection.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
    private String name = "Java Reflection";

    private void greet(){
        System.out.println("Hello from greet");
    }
}

public class JavaReflectionMain {
    public static void main(String[] args) throws Exception {
        // Access private field
        Person person = new Person();
        Field field = person.getClass().getDeclaredField("name");
        field.setAccessible(true);
        System.out.println("person name : " + field.get(person));
        field.set(person,"Java Collections");
        System.out.println("person name : " + field.get(person));

        // Access private method
        Method method = person.getClass().getDeclaredMethod("greet");
        method.setAccessible(true);
        method.invoke(person);
    }
}
