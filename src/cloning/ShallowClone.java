package cloning;

class Passport implements Cloneable {
    String passportNumber;

    public Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student implements Cloneable {
    String name;
    Passport passport;

    public Student(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        // shallow cloning
//        return super.clone();

        // deep cloning
        Student student = (Student) super.clone();
        student.passport = (Passport) passport.clone();
        return student;
    }

}

public class ShallowClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Passport passport = new Passport("63838");
        Student student = new Student("Raj", passport);

        // clone student
        Student cloneStudent = (Student) student.clone();

        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(cloneStudent.name);
        System.out.println(cloneStudent.passport.passportNumber);

        System.out.println("---------------------");
        // modify
        cloneStudent.name = "Rahul";
        cloneStudent.passport.passportNumber = "90";
        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        System.out.println(cloneStudent.name);
        System.out.println(cloneStudent.passport.passportNumber);
    }
}
