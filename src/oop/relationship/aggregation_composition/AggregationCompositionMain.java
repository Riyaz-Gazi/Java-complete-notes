package oop.relationship.aggregation_composition;

class Passport {
    String passportNumber;

    public Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}

class Student {
    String name;
    Passport passport;

    // Aggregation
    public Student(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    // Composition
    public Student(String name, String passportNumber) {
        this.name = name;
        this.passport = new Passport(passportNumber);
    }

}

public class AggregationCompositionMain {
    public static void main(String[] args) {

    }
}
