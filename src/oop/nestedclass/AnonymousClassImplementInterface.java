package oop.nestedclass;

interface Greet {
    void sayHello();
}

public class AnonymousClassImplementInterface {
    public static void main(String[] args) {
        // Using Anonymous class
        Greet greet = new Greet() {
            @Override
            public void sayHello() {
                System.out.println("Hello From Anonymous class");
            }
        };

        greet.sayHello();

        // Using Lambda
        Greet greet1 = () -> System.out.println("Hello From Anonymous class using lambda");
        greet1.sayHello();

    }
}
