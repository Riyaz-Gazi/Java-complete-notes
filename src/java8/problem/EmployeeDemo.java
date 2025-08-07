package java8.problem;

import java.util.*;
import java.util.stream.Collectors;

class Employees {
    private String firstName;
    private String lastName;
    private String fatherName;
    private int rank;
    private List<String> jobs;
    private String department;

    public Employees(String firstName, String lastName, String fatherName, int rank, List<String> jobs, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.rank = rank;
        this.jobs = jobs;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getRank() {
        return rank;
    }

    public List<String> getJobs() {
        return jobs;
    }

    public String getDepartment() {
        return department;
    }


    // group by department
    // have rank > 5
    // sorted by firstName,lastName,fatherName

    Comparator<Employees> byFirstName = Comparator.comparing(Employees::getFirstName);
    Comparator<Employees> byLastName = Comparator.comparing(Employees::getLastName);
    Comparator<Employees> byFatherName = Comparator.comparing(Employees::getFatherName);

    Comparator<Employees> sortingCriteria = byFirstName.thenComparing(byLastName).thenComparing(byFatherName);

    Map<String, List<Employees>> transformation(List<Employees> employees) {
        return employees
                .stream()
                .filter(e -> e.rank > 5)
                .collect(Collectors.groupingBy(
                        e -> e.department,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream().sorted(sortingCriteria).collect(Collectors.toList())
                        )
                ));
    }

    Map<String, List<Employees>> transform(List<Employees> employees) {
        return employees.stream()
                .filter(e -> e.rank > 5)
                .collect(Collectors.groupingBy(
                        e -> e.department,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator
                                                .comparing((Employees e) -> e.firstName)
                                                .thenComparing(e -> e.lastName)
                                                .thenComparing(e -> e.fatherName))
                                        .collect(Collectors.toList())
                        )
                ));
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

    }
}
