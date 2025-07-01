package oop.abstraction;

abstract class Vehicle {
    abstract void start();
    void stop() {
        System.out.println("Car is stopping");
    }
}

interface Drivable {
    int wheel = 4;
    void drive();
}

class Car extends Vehicle implements Drivable {

    @Override
    void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}

public class AbstractionTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
        car.stop();
        System.out.println(Car.wheel);
    }
}
