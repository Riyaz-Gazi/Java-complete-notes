package comparable_comparator.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal {
    int age;
    String name;
    int weight;

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name=" + name +
                ", weight=" + weight +
                '}';
    }
}

class CustomDogComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.name.compareTo(o2.name);
    }

}

public class ComparatorMain {
    public static void main(String[] args) {
        Animal a1 = new Animal(2, "Leo", 10);
        Animal a2 = new Animal(2, "Maxo", 23);
        Animal a3 = new Animal(1, "Don", 12);

        List<Animal> animals = Arrays.asList(a1, a2, a3);

        System.out.println("Before Sorting");
        System.out.println(animals);

        System.out.println("After Sorting");

        // Methods - 1
        Collections.sort(animals, new CustomDogComparator());

        // Method - 2
        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                if (o1.age == o2.age) {
                    return o1.name.compareTo(o2.name);
                }
                return o1.age - o2.age;
            }
        });

        // Method - 3 using lambda + comparator
        Collections.sort(animals, (o1, o2) -> {
            if (o1.age == o2.age) {
                return o1.name.compareTo(o2.name);
            }
            return o1.age - o2.age;
        });

        // Method - 4
        Collections.sort(animals, Comparator.comparing(Animal::getAge));
        System.out.println(animals);
    }
}
