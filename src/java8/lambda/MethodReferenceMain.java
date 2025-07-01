package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

class User {
    User() {
        System.out.println("User created");
    }
}

public class MethodReferenceMain {
    public static void main(String[] args) {

        // Static Method Reference
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        numbers.forEach(s-> System.out.println(s)); // Using Lambdas , it is a consumer
        numbers.forEach(System.out :: println);

        // Constructor Method Reference
        Supplier<User> userCreate = User :: new;
        userCreate.get(); // user is created


    }
}
