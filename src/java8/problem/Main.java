package java8.problem;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private int departmentId;
    private double salary;

    public Employee(int id, String name, int departmentId, double salary) {
        this.id = id;
        this.name = name;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public double getSalary() {
        return salary;
    }
}

record Person(int age, String name) {

}

public class Main {
    public static void main(String[] args) {

        Person p = new Person(2, "Riyaz");

        System.out.println(p.age() + " " + p.name());

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee(1, "Alice", 101, 5000));
        employeeMap.put(2, new Employee(2, "Bob", 102, 7000));
        employeeMap.put(3, new Employee(3, "Charlie", 101, 6000));
        employeeMap.put(4, new Employee(4, "David", 102, 8000));
        employeeMap.put(5, new Employee(5, "Eve", 101, 5500));

        final Map<Integer, List<Employee>> groupedAndSorted = employeeMap
                .values()
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartmentId,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                        .collect(Collectors.toList())
                        )
                ));

        

//
        // Print the result
        groupedAndSorted.forEach((deptId, empList) -> {
            System.out.println("Department: " + deptId);
            empList.forEach(e ->
                    System.out.println("   " + e.getName() + " - $" + e.getSalary()));
        });
    }
}
