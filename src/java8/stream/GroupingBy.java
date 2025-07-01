package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class GroupingBy {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(28, "Riyaz"),
                new Person(30, "Mehak"),
                new Person(30, "Priyanka"),
                new Person(28, "Rahul")
        );

        final Map<Integer, List<Person>> collect = people.stream().collect(Collectors.groupingBy(Person::getAge));

        System.out.println(collect);

        final Map<Integer, List<String>> collect1 = people.stream().collect(Collectors.groupingBy(
                Person::getAge,
                Collectors.mapping(person -> person.getName(), Collectors.toList())
        ));

        System.out.println(collect1);
    }
}
