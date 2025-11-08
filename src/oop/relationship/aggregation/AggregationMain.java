package oop.relationship.aggregation;

import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    List<Employee> employees;

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }
}

public class AggregationMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Riyaz");
        Employee emp2 = new Employee("Rahul");
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);

        Department department = new Department("IT",employees);
        /**
         * A class can have another class within it but does not owns it weak relationship
         * Aggregation is has-a relationship with weak ownership(can exists independently)
         * If Department objects destroy employee objects still exists
         */
    }
}
