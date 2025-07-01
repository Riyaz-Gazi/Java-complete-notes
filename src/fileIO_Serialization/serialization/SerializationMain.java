package fileIO_Serialization.serialization;

import java.io.*;

class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    String name;
    int age;
}

public class SerializationMain {
    public static void main(String[] args) {
        // Serialization
        Employee emp = new Employee();
        emp.name = "John Doe";
        emp.age = 12;

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            output.writeObject(emp);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Check the path for the ""employee.ser

        File file = new File("employee.ser");
        System.out.println("Serialized to: " + file.getAbsolutePath());

        // Deserialization

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee employee = (Employee) input.readObject();
            System.out.println("employee age " + employee.age);
            System.out.println("employee name " + employee.name);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
