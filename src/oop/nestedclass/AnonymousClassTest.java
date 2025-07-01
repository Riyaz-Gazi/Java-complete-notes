package oop.nestedclass;

interface Greeting {
    void sayHello();
}

class Animal {
    public void makeSound() {
        System.out.println("Animal Sound");
    }
}

public class AnonymousClassTest {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Greeting");
            }
        };

        greeting.sayHello();

        Animal dog = new Animal() {

            @Override
            public void makeSound() {
                System.out.println("Bark!");
            }
        };

        dog.makeSound();

    }
}
