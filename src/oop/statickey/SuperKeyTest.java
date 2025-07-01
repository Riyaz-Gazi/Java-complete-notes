package oop.statickey;

class Animal {
    String type = "Animal";

    Animal(String name) {
        System.out.println("Animal: " + name);
    }

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    String type = "Dog";

    Dog() {
        super("Dog"); // calls Animal's constructor
    }

    void printType() {
        System.out.println(super.type);
    }

    void sound() {
        super.sound();
        System.out.println("Dog Sound");
    }
}


public class SuperKeyTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printType();
        dog.sound();
    }
}
