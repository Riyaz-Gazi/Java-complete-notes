package oop.relationship.association;

import java.util.ArrayList;
import java.util.List;

class Passport {
    private String passportNumber;

    public Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

}

class Student {
    private String name;

    // One-One
    private Passport passport;

    // One-Many
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public Student(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }


    public String getName() {
        return name;
    }

    public void addCourses(Course course) {
        courses.add(course);
    }

    public void studentDetails() {
        System.out.println("student name : " + name);
        System.out.println("passport number : " + passport.getPassportNumber());
    }
}

class College {
    private String name;

    private List<Student> students;

    public College(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println("Name " + student.getName());
        }
    }
}

class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudents(Student student) {
        students.add(student);
    }
}


public class AssociationMain {
    public static void main(String[] args) {
        /**
         * What are the relationships between the classes?
         * Howe object are interacts each others
         * Three types of relationship - Association , Aggregation , Composition
         * Associations
         * A general relationship where two classes are connected, but neither owns the other.
         * Both objects can exist independently.
         * Type of Associations One-One , One-Many , Many-Many
         */
    }
}
