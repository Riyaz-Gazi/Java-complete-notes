package comparable_comparator.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Animal implements Comparable<Animal> {
    int age;
    String name;
    int weight;

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name=" + name +
                ", weight=" + weight +
                '}';
    }


    @Override
    public int compareTo(Animal o) {
        if (this.age == o.age) {
            return this.name.compareTo(o.name);
        }
        return this.age - o.age;
    }
}

public class ComparableMain {
    public static void main(String[] args) {
        Animal a1 = new Animal(2, "Leo", 10);
        Animal a2 = new Animal(2, "Maxo", 23);
        Animal a3 = new Animal(1, "Don", 12);

        List<Animal> animals = Arrays.asList(a1, a2, a3);

        System.out.println("Before Sorting");
        System.out.println(animals);

        System.out.println("After Sorting");
        Collections.sort(animals);
        System.out.println(animals);

    }
}
