package fileIO_Serialization.tuf;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("D:/Java-Complete-Notes/src/fileIO_Serialization/tuf/test.txt"));
            bw.write("Hey I am writing this for you");
            bw.newLine();
            bw.write("Hello from Kolkata");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            bw.close();
        }
    }
}
