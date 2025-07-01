package oop.classes;

class Car {
    String color;
    int year;

    public Car() {

    }

    public Car(String color) {
        this.color = color;
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public void carDetails() {
        System.out.println("color " + color + " year " + year);
    }
}

public class ClassTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.year = 2021;
        car.color = "Red";

        car.carDetails();
    }
}
