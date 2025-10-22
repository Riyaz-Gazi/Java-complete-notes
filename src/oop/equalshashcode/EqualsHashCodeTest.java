package oop.equalshashcode;

import java.util.Objects;

class Person{
    String name;
    String email;

    public Person(String name,String email){
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class EqualsHashCodeTest {
    public static void main(String[] args) {
        Person p1 = new Person("Alice","alice@gmail.com");
        Person p2 = new Person("Alice","alice@gmail.com");
        Person p3 = p1;
        System.out.println(p1 == p3);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p1.hashCode() == p2.hashCode());
    }
}
