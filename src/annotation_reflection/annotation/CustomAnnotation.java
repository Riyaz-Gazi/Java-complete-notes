package annotation_reflection.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
    String value();
}

class MyService {
    @MyAnnotation("Say hello")
    public void greet() {
        System.out.println("Hello!");
    }
}

public class CustomAnnotation {
    public static void main(String[] args) throws NoSuchMethodException {
        MyService myService = new MyService();
        myService.greet();

        // Using Reflection
        Method method = MyService.class.getDeclaredMethod("greet");
        MyAnnotation annotation = method.getDeclaredAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
    }
}
