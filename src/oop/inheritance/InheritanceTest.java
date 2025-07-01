package oop.inheritance;

class Vehicle{
    public void start(){
        System.out.println("vehicle is staring");
    }
}

class Car extends Vehicle{
    public void drive(){
        System.out.println("car is starting");
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
    }
}
