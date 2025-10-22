package comparable_comparator.comparator;

import java.util.*;

class Student {
    int marks;
    String name;
    int rollNo;

    public Student(int marks, String name, int rollNo) {
        this.marks = marks;
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return name + " (Marks: " + marks + ", RollNo: " + rollNo + ")";
    }

    // Getters (Optional if using method references)
    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}

public class MultilevelCriteriaMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(90, "Alice", 3));
        students.add(new Student(95, "Bob", 2));
        students.add(new Student(95, "Alice", 1));
        students.add(new Student(85, "Charlie", 4));
        students.add(new Student(95, "Bob", 1));

        // Before Sorting
        System.out.println(students);

        // After Sorting
        // Sort: marks (desc), name (asc), rollNo (asc)
        Comparator<Student> byMarks = Comparator.comparingInt(Student::getMarks).reversed();
        Comparator<Student> byName = Comparator.comparing(Student::getName);
        Comparator<Student> byRollNo = Comparator.comparingInt(Student::getRollNo);
        Comparator<Student> multiLevelComparator = byMarks
                .thenComparing(byName)
                .thenComparing(byRollNo);
        students.sort(multiLevelComparator);

        // another form of comparator
        Collections.sort(students,Comparator.comparingInt(Student::getMarks).reversed().thenComparing(Student::getName).thenComparingInt(Student::getRollNo));
        System.out.println(students);
    }
}
