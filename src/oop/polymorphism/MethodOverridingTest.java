package oop.polymorphism;

class Animal {
    public void sound() {
        System.out.println("Animal is sounding");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog is sounding");
    }

}

public class MethodOverridingTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.sound();
        dog.sound();
    }
}
