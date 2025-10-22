package oop.nestedclass;


interface Greeting {
    void greet();
}

class Animals {
    public void makeSound() {
        System.out.println("Animal is sounding");
    }
}

public class AnonymousClassTest {
    public static void main(String[] args) {
        // Anonymous class from interface
        // method - 1
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello From Greeting using Normal Implementation");
            }
        };

        greeting.greet();

        // Method - 2
        // from lambda expression
        Greeting greeting1 = () -> System.out.println("Hello from greeting using Lambda");
        greeting1.greet();

        // Anonymous class from extends class
        // Method - 1
        Animals dog = new Animals() {
            @Override
            public void makeSound() {
                System.out.println("Dog is sounding using Normal Implementation");
            }
        };
        dog.makeSound();
    }
}
