package oop.encapsulation;

class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationTest {
    public static void main(String[] args) {

        Person p = new Person();
        p.setName("Jasmin");
        System.out.println(p.getName());

    }
}
