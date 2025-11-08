package java8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamProblem {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
        empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));


        // Group the employee by City
        Map<String, List<Employee>> employeeByCity = empList.stream().collect(Collectors.groupingBy(
                Employee::getCity
        ));

        System.out.println(employeeByCity);

        // Group Employee By Age
        Map<Integer, List<Employee>> employeeByAge = empList.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(employeeByAge);

        // count of male and female employees
        Map<String, Long> employeeCountByGender = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(employeeCountByGender);

        // find all department
        List<String> getAllDistinctDepartment = empList.stream().map(Employee::getDeptName).distinct().collect(Collectors.toList());
        System.out.println(getAllDistinctDepartment);

        // employee whose age is greater than 28
        List<Employee> getAllEmployeeAgeGreaterThan28 = empList.stream().filter(e -> e.getAge() > 28).collect(Collectors.toList());
        System.out.println(getAllEmployeeAgeGreaterThan28);

        // maximum age of employee
        OptionalInt maximumAge = empList.stream().mapToInt(Employee::getAge).max();
        if(maximumAge.isPresent()){
            System.out.println(maximumAge.getAsInt());
        }

        // Average age of Male and Female Employees
        Map<String, Double> averageAgeByGender = empList.stream().collect(Collectors.groupingBy(
                Employee::getGender, Collectors.averagingDouble(Employee::getAge)
        ));
        System.out.println(averageAgeByGender);

        // Number of employees in each department.
        Map<String, Long> countEmployeeByDepartment = empList.stream().collect(Collectors.groupingBy(
                Employee::getDeptName,
                Collectors.counting()
        ));
        System.out.println(countEmployeeByDepartment);

        // Find oldest employee
        Optional<Employee> oldestEmployee = empList.stream().max(Comparator.comparing(Employee::getAge));
        System.out.println("Oldest employee : "+oldestEmployee.get());

        // Find youngest female employee.
        Optional<Employee> youngestFemale = empList.stream().filter(emp -> emp.getGender() == "F").min(Comparator.comparing(Employee::getAge));
        System.out.println("Youngest Female Employee : "+youngestFemale.get());

        // Find employees whose age is greater than 30 and less than 30.
        Map<Boolean, List<Employee>> employeeWithAge = empList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 30 || e.getAge() < 20));
        System.out.println(employeeWithAge.get(true));

        // Find if there any employees from HR Department.
        Optional<Employee> emp = empList.stream().filter(e -> e.getDeptName().equalsIgnoreCase("HR"))
                .findAny();
        if(emp.isPresent()){
            System.out.println("Employee from HR department "+emp.get());
        }

        // Find all employees who lives in ‘Blore’ city, sort them by their name
        List<Employee> bloreCityEmployee = empList.stream().filter(e -> e.getCity().equalsIgnoreCase("Blore"))
                .sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(bloreCityEmployee);

        // No of employees in the organisation.
        long totalEmployee = empList.stream().count();
        System.out.println("Total Employee "+ totalEmployee);

        // Highest experienced employees in the organization.
        Optional<Employee> seniorEmp = empList.stream().sorted(Comparator
                .comparingInt(Employee::getYearOfJoining)).findFirst();
        System.out.println("Senior Employee Details :" + seniorEmp.get());

        // Print Average salary of each department.
        Map<String, Double> aveSalaryByDepartment = empList.stream().collect(Collectors.groupingBy(
                Employee::getDeptName,
                Collectors.averagingDouble(Employee::getSalary)
        ));
        System.out.println(aveSalaryByDepartment);

        // Find Highest salary in the organisation.
        Optional<Employee> highestSalary = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .findFirst();
        System.out.println("Highest Salary Employee" + highestSalary.get());

        // Find Second Highest salary in the organisation.
        Optional<Employee> secondHighestSalary = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
                .reversed()).skip(1).findFirst();
        System.out.println("Second Highest Salary in the organisation : " + secondHighestSalary.get().getSalary());

        // Nth Highest salary.
        int n = 5;// this can be any nth number highest salary
        Optional<Employee> NthHighestSalary = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
                .reversed()).skip(n - 1).findFirst();
        System.out.println("Second Highest Salary in the organisation : " + NthHighestSalary.get().getSalary());

        // Sort the employees salary in the organisation in ascending order
        List<Employee> salaryByAscendingOrder = empList.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(salaryByAscendingOrder);

        // Sort the employees salary in the organisation in descending order
        List<Employee> salaryByDescendingOrder = empList.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(salaryByAscendingOrder);

    }
}
